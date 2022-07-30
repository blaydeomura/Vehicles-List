package for_VehiclesForTxt;

public abstract class Vehicle {

	protected static int numVehicles = 0;
	protected String manufacturer;
	protected int numWheels;
	
	public Vehicle(String theManufacturer, int theNumWheels)
	{
		numVehicles++;
		manufacturer = theManufacturer;
		numWheels = theNumWheels;
	}
	
	public String toString()
	{
		return "The manufacturer: " + manufacturer + ", number of wheels: " + numWheels + ", number of vehicles: " + numVehicles + ",";
	}
	
}
