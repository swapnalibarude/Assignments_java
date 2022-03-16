package Assignment3q6;


	import java.util.Scanner;
	public class Person
	{   

		public static void checkDetails(String personFirstName,String personLastName,int age)throws UserException
		{
			try
			{
			if(age>=18 && age<60) System.out.println("Age of "+personFirstName+" "+personLastName+" is between 18-60.");
			else throw new UserException("Age of "+personFirstName+" "+personLastName+" is not between 18-60");
			}catch(Exception e)
			{
				throw new UserException(e.getMessage());
			}
			}
		
		public static void main(String gg[])
		{
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Enter first name : ");
			 String personFirstName = scanner.next();
			 System.out.println("Enter last name : ");
			 String personLastName = scanner.next();
			 System.out.println("Enter a person age : ");
			 int age =scanner.nextInt();
			 
			 try {
			 	    
				checkDetails(personFirstName,personLastName,age);
				
			}catch(UserException ue)
				{
					System.out.println(ue.getMessage());
				}
		scanner.close();	
		}
}
