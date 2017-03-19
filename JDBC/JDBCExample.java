package JDBC; /**
 * Created by jasdeepkaur on 3/15/17.
 */
import java.sql.*;

public class JDBCExample {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/Edureka";

    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{

            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");


            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();

            String sql = "CREATE TABLE Student " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";

            stmt.executeUpdate(sql);





            System.out.println("Inserting records into the table...");
            //stmt = conn.createStatement();

            String sql1 = "INSERT INTO Student " +
                    "VALUES (100, 'Zara', 'Ali', 18)";
            stmt.executeUpdate(sql1);
            sql1= "INSERT INTO Student " +
                    "VALUES (101, 'Mahnaz', 'Fatma', 25)";
            stmt.executeUpdate(sql1);
            sql1 = "INSERT INTO Student " +
                    "VALUES (102, 'Zaid', 'Khan', 30)";
            stmt.executeUpdate(sql1);
            sql1 = "INSERT INTO Student " +
                    "VALUES(103, 'Sumit', 'Mittal', 28)";
            stmt.executeUpdate(sql1);
            System.out.println("Inserted records into the table...");



            System.out.println("updatation start");
            String sql2 = "UPDATE Student " +
                    "SET age = 30 WHERE id in (100, 101)";
            stmt.executeUpdate(sql2);

            sql2 = "SELECT id, first, last, age FROM Student";
            ResultSet rs = stmt.executeQuery(sql2);

            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }
            rs.close();


            System.out.println("Deletion process");
            String sql3 = "DELETE FROM Student " +
                    "WHERE id = 101";
            stmt.executeUpdate(sql3);
            sql3 = "SELECT id, first, last, age FROM Student";
            ResultSet rs1 = stmt.executeQuery(sql3);

            while(rs1.next()){
                int id  = rs1.getInt("id");
                int age = rs1.getInt("age");
                String first = rs1.getString("first");
                String last = rs1.getString("last");

                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }
            rs1.close();
        }catch(SQLException se){

            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}