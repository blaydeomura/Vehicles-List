package for_VehiclesForTxt;

public abstract class TwoWheeler extends Vehicle{

	protected String model;
	protected int weight;
	
	public TwoWheeler(String theManufacturer, int theNumWheels, String theModel, int theWeight)
	{
		super(theManufacturer, theNumWheels);
		model = theModel;
		weight = theWeight;
		
	}
	
	@Override
	public String toString()
	{
		String veh = super.toString();
		return veh + "the model: " + model + ", the weight: " + weight + ",";
	}
	
}
