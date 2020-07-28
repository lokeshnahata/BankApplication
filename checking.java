package bankapplication;

public class checking extends account {
 //list specific properties
	 private int debitcardnumber;
	 private int pin;
	//constructor to initialize
	public checking (String name,String ssn,double initdeposit)
	{
		super (name,ssn,initdeposit);
		accountnumber = "2"+accountnumber;
		setdebitcard();
		
	
	}
	@Override
	public void setrate()
	{
		rate = getBaserate()*.15;
	}
	//list any methods specific to it
	private void setdebitcard()
	{
		debitcardnumber =(int) (Math.random()*Math.pow(10, 12));
		pin =(int)(Math.random()*Math.pow(10,4));
		
	}
	public void showinfo()
	{
		super.showinfo();
		System.out.println("Your checking account features : "+"\nDebit Card Number : "+debitcardnumber+"\nDebit Card Pin : "+pin);
	}
}
