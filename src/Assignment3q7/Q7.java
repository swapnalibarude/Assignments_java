package Assignment3q7;
import java.util.Scanner;
public class Q7
{
	private static Scanner scanner;
	public static int quotient=0;

	public static void main(String gg[])
	{
	
		 try {
			 scanner = new Scanner(System.in);
			 System.out.println("Enter Num 1 : ");
			 int num1 = scanner.nextInt();
			 System.out.println("Enter Num2 : ");
			 int num2 = scanner.nextInt();
			 quotient=num1/num2;
			 }catch(ArithmeticException ae)
			 {
				 System.out.println("DivideByZeroException");
			 }
			 finally
			 {
				System.out.println("Inside finally block"); 
			 }
	}
}