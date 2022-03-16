package Assignment3q3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Q3
{
	private static ObjectInputStream ois;
	private static ObjectOutputStream oos;

	public static void main(String gg[]) 
	{
		Address add=new Address("Chinchwad","Pune","India");
		Employee emp=new Employee(14,"Swapnali",add,40000);
	
		try {
		
			oos = new ObjectOutputStream(new FileOutputStream(new File("C:/Users/Swapnali/Pictures/2021-02-24")));		
      		oos.writeObject(emp);	
      		System.out.println("Object is Serialized");
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
		
	
		emp=null;
		try
         {
            ois = new ObjectInputStream(new FileInputStream(new File("C:/Users/Swapnali/Pictures/2021-02-24")));
            emp=(Employee) ois.readObject();
            System.out.println("Object is Deserialized");
         }catch(IOException io)
         {
        	 io.printStackTrace();
         }catch(ClassNotFoundException cnfe)
         {
        	 cnfe.printStackTrace();
         
         }
		System.out.println(add.toString());
	}
}


