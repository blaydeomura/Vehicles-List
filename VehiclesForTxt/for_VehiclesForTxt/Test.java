package for_VehiclesForTxt;

public class Test {

	public static void main(String[] args) {
		
		Automobile a1 = new Sedan("Honda", 4, 25, 5, "Civic", SedanTypes.Small, 4, 150.0);
		Automobile a2 = new Truck("Chevy", 4, 20, 3, "Silverado", 4, 13000, TruckTypes.Pickup);
		
		TwoWheeler t1 = new Bicycle("Trek", 2, "Skye SLX", 10, 110, true, true);
		TwoWheeler t2 = new MotorCycle("BMW", 2, "R18", 761, 50, 91);
		
		Vehicle[] veharr = {a1, a2, t1, t2};
		
		for(Vehicle v : veharr) {
			System.out.println(v.toString());
		}
		
		System.out.println("The total number of Vehicles should be 4: ");
		System.out.println(Vehicle.numVehicles);
		
	}

}
