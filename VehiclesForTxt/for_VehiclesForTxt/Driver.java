package for_VehiclesForTxt;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 VehiclesList lc = new VehiclesList();
	        lc.addVehiclesFromFile("vehicles.txt");
	        UserInterface ui = new UserInterface();
	        ui.mainLoop(lc);
		
	}

}
