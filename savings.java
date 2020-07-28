package bankapplication;

public class savings extends account
{
	//list specific properties
	 private int safetydepositboxID;
	 private int safetydepositkey;
		//constructor to initialize  savings properties
		public savings(String name,String ssn,double initdeposit)
		{
			super (name,ssn,initdeposit);
			accountnumber = "1"+accountnumber;
			setSafetydepositbox();
			
		}
		
		@Override
		public void setrate()
		{
			rate = getBaserate()- .25;
		}
		private  void setSafetydepositbox()
		{
			safetydepositboxID	= (int)(Math.random()*Math.pow(10, 3));
			
			safetydepositkey =(int)(Math.random()*Math.pow(10, 4));
		}
		
		//list any methods specific to it
		public void showinfo()
		{
			
			super.showinfo();
			System.out.println("Your savings account features -"+"\nSafety deposity box ID : "+safetydepositboxID
					+"\nSafety deposit box key : "+safetydepositkey);
		}
}
