package bankapplication;
//not be able to create objects from accounts class
public  abstract class account implements Ibaserate
{
  //list common property for saving and checking accounts
	 private String name;
	 private String ssn;
	  private double balance;
	  private static int index = 10000;
	  protected String accountnumber;
	 protected double rate; 
	//constructor to set base properties and initialise accnt
	 public account(String name,String ssn,double initdeposit)
	 {
		this.name = name;
		this.ssn =ssn;
		balance = initdeposit;
		
	    
		//set account number
		index++;
		this.accountnumber =setaccountnumber();
		
	setrate();
		
	 }
	 public abstract void setrate();
	
	 private String setaccountnumber()
	 {
		 String lasttwossn = ssn.substring(ssn.length()-2,ssn.length());
		 int uniqueid = index;
		 int randomno = (int)(Math.random()*Math.pow(10, 3));
		 return lasttwossn+uniqueid+randomno;
	 }
	 
	 public void  compound()
	 {
		 double accuredInterest = balance * (rate/100);
		 balance +=accuredInterest;
		 System.out.println("Accured Interest : $"+accuredInterest );
		 printbalance();
	 }
	//list common methods
	 public void deposit(double amt)
	 {
		 balance = balance +amt;
		 System.out.println("Depositing $"+amt);
		 printbalance();
	 }
	 public void withdraw(double amt)
	 {
		 balance -= amt;
		 System.out.println("Wihdrawing $"+amt);
		 printbalance();
	 }
	 public void transfer(String towhere, double amt)
	 {
		 balance = balance - amt;
		 System.out.println("Transferring $"+amt+" to "+towhere);
		 printbalance();
	 }
	 
	 public void printbalance()
	 {
		 System.out.println("Your balance is now : $"+balance);
	 }
	 public void showinfo()
	 {
		 System.out.println("NAME : "+name+"\nACCOUNT NUMBER : "+accountnumber+"\nBALANCE : "+balance+"\nRate : "+rate+"%");
	 }
}
