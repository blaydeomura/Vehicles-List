package for_VehiclesForTxt;

public class Truck extends Automobile{

	protected int numAxles;
	protected int grossVehicleMass;
	protected TruckTypes type; 
	
	public Truck(String theManufacturer, int theNumWheels, double theMpg, int theNumSeats, String theModel, int theNumAxles, int theGrossVehicleMass, TruckTypes theTruckType)
	{
		super(theManufacturer, theNumWheels, theMpg, theNumSeats, theModel);
		numAxles = theNumAxles;
		grossVehicleMass = theGrossVehicleMass;
		type = theTruckType; 
	}
	
	@Override
	public String toString()
	{
		String autoMob = super.toString();
		return autoMob + "The number of axles: " + numAxles + ", the gross vehicle mass: " + grossVehicleMass + ", the truck type: " + type + ",";
	}
	
}
