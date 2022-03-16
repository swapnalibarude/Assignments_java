package Assignment2q3;

public class Q3 {

	static Account ac1;
	   static Account ac2;
		public static void main(String[] args) {	
				ac1=new SavingAcc("Swapnali", "12345", 40000, 6, 2000);
				System.out.println(ac1.toString());
				ac1.withdraw(4000);
				System.out.println("Account Balance in Account Number :"+ac1.getAccountNumber()+" is : "+ac1.getAccountBalance());
				
		    	ac2=new CurrentAcc("vaishnavi", "141545445", 70000, "SB1411", 40000);	    
		    	System.out.println(ac2.toString());
		    	ac2.withdraw(2000);
		    	System.out.println("Account Balance in Account Number :"+ac2.getAccountNumber()+" is : "+ac2.getAccountBalance());
		}
	}


