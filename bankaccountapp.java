package bankapplication;

import java.util.LinkedList;
import java.util.List;

public class bankaccountapp
{
   public static void main (String[]args)
   {
	   List<account> accounts = new LinkedList<account>();
	   
	   
	   
	   String file ="C:\\Java Projects\\NewBankAccounts.csv";
	   
	   List <String[]> newCustomer = utilities.csv.read(file);
	   
	   for(String[] Customer:newCustomer)
	   {
		   String name = Customer[0];
		   String ssn = Customer[1];
		   String accounttype = Customer[2];
		   double initdeposit = Double.parseDouble(Customer[3]);
		 
		   
		   if (accounttype.equals("Savings"))
		   {
	
			   accounts.add(new savings(name,ssn,initdeposit));
		   }
		   else if (accounttype.equals("Checking"))
		   {

		   accounts.add(new checking(name,ssn,initdeposit));
		   }
		   else
		   {
			   System.out.println("ERROR READING ACCOUNT TYPE");
		   }
		  
	   }
	   
	 
	   
	  for (account acc: accounts)
	  {
		  System.out.println("\n****************");
		  acc.showinfo();
	  }
	   
	  //accounts.get((int)Math.random()*accounts.size()).deposit(1000);
	  //accounts.get((int)Math.random()*accounts.size()).deposit(3000);
	 
	   /*checking chkacc1 = new checking("lol koe","123456789",1800);
	   
	   savings savacc1 = new savings ("jack mill","174829432",2000);
	   
	   //read .csv file and create new accnt based on data
	  
	  
	   savacc1.showinfo();
	   System.out.println("**********************");
	   chkacc1.showinfo();*/
	     
	   
	  
   }
}
