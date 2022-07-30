package for_VehiclesForTxt;

public class Bicycle extends TwoWheeler{

	protected int caloriesBurnedPerHour;
	protected Boolean hasGears;
	protected Boolean hasSuspensions;
	
	public Bicycle(String theManufacturer, int theNumWheels, String theModel, int theWeight, int theCaloriesBurnedPerHour, Boolean theHasGears, Boolean theHasSuspensions)
	{
		super(theManufacturer, theNumWheels, theModel, theWeight);
		caloriesBurnedPerHour = theCaloriesBurnedPerHour;
		hasGears = theHasGears;
		hasSuspensions = theHasSuspensions;
	}

	@Override
	public String toString()
	{
		String bike = super.toString();
		return bike + "calories burned per hours: " + caloriesBurnedPerHour + ", has gears?: " + hasGears + ", has suspensions?: " + hasSuspensions + ",";
	}
	
}
