package for_VehiclesForTxt;

public class MotorCycle extends TwoWheeler{

	protected double mpg; 
	protected int horsepower;
	

	public MotorCycle(String theManufacturer, int theNumWheels, String theModel, int theWeight, double theMpg, int theHorsepower)
	{
		super(theManufacturer, theNumWheels, theModel, theWeight);
		mpg = theMpg;
		horsepower = theHorsepower;
	}
	
	@Override
	public String toString()
	{
		String motor = super.toString();
		return motor + "the mpg: " + mpg + ", the horsepower: " + horsepower + ",";
	}
	
}
