package bankapplication;

public interface Ibaserate 
{

	//write a method that returns the base rate
	default double getBaserate()
	{
		return 2.5;
	}
}
