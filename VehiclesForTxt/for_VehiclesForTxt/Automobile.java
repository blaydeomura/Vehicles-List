package for_VehiclesForTxt;

public class Automobile extends Vehicle{

	protected double mpg; 
	protected int numSeats;
	protected String model;
	
	public Automobile(String theManufacturer, int theNumWheels, double theMpg, int theNumSeats, String theModel)
	{
		super(theManufacturer, theNumWheels);
		mpg = theMpg;
		numSeats = theNumSeats;
		model = theModel;
	}
	
	@Override
	public String toString()
	{
		String veh = super.toString();
		return veh + "the mpg: " + mpg + ", the number of seats: " + numSeats + ", the model is: " + model + ", ";
	}
	
}
