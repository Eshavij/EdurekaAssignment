//Write a program to write 5 employee records using HashMap and display them.

package Module5;

import java.util.HashMap;
import java.util.Map;

public class Module5_3 {
	public static void main(String[]args){
		      
	        Map<String, Integer>emp = new HashMap<String, Integer>(5, 5);  
	        
	        emp.put("John", 600000);  
	        emp.put("Clark", 550000);  
	        emp.put("Nancy", 500000);  
	        emp.put("Joe", 500000);  
	        emp.put("Mary", 300000);  
	        
	        System.out.println(emp); 
	         
	    }  
	}



