package for_VehiclesForTxt;

public class Sedan extends Automobile {

	protected SedanTypes type; 
	protected int numCylinders;
	protected double horsePower; 
	
	
	public Sedan(String theManufacturer, int theNumWheels, double theMpg, int theNumSeats, String theModel, SedanTypes theSedanTypes, int theNumCylinders, double theHorsePower)
	{
		super(theManufacturer, theNumWheels, theMpg, theNumSeats, theModel);
		type = theSedanTypes;
		numCylinders = theNumCylinders;
		horsePower = theHorsePower;
		
	}
	
	@Override
	public String toString()
	{
		String autoMob = super.toString();
		return autoMob + "the Sedan type is" + type + ", the Number of cylinders" + numCylinders + ", the horse power is: " + horsePower + ",";
	}

	
}
