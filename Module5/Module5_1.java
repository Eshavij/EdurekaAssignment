//Write a program to write 5 student records into a Hashtable and display the student whose marks are the highest in the class.
package Module5;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Module5_1 {
	public static void main(String[] args) {  
	      
        Hashtable<String, Integer>stu = new Hashtable<String, Integer>(5, 5);  
        
        stu.put("Esha", 53);
        stu.put("Meena", 60);  
        stu.put("Neha", 55);  
        stu.put("jasdeep", 50);  
        stu.put("raga", 54);
        
        
        ArrayList<String> maxKeyList=new ArrayList<String>();
        Integer maxValue = Integer.MIN_VALUE; 
    
        for(Entry<String, Integer> entry : stu.entrySet()) 
        {
             if(entry.getValue() > maxValue) {
                 maxValue = entry.getValue();
                 maxKeyList.add(entry.getKey());
             }
        }
        System.out.println(" max marks : "+maxKeyList);
    }

}
