package for_VehiclesForTxt;

import java.util.Scanner;
import java.io.*;

public class VehiclesList {

	private Vehicle[] vehiclesList; 
	private int currentIndex = 0;
	private int numVehicles = 0;
	
	
	private void setNumVehicles(int num)
	{
		numVehicles = num;
		vehiclesList = new Vehicle[numVehicles];
	}
	
	public void addVehicle(Vehicle v)
	{
		vehiclesList[currentIndex] = v;
		currentIndex++;
	}
	
	
	
	public void addVehiclesFromFile(String fileName)
	{
		
		File f = new File(fileName);
		
		try {
			Scanner scan = new Scanner(f);
			String line = scan.nextLine();
			int numVehicles = Integer.parseInt(line);
			setNumVehicles(numVehicles);
			while(scan.hasNextLine())
			{
				String next = scan.nextLine();
				String[] eachLine = next.split(", "); 
				String vehicleType = eachLine[0];
				String kind = vehicleType;
				Vehicle v = null; 
				
				switch(kind) {
					case "Sedan":
						SedanTypes st = SedanTypes.valueOf(eachLine[6]);
						v = new Sedan(eachLine[1], Integer.parseInt(eachLine[2]), Double.parseDouble(eachLine[3]), Integer.parseInt(eachLine[4]), eachLine[5], st, Integer.parseInt(eachLine[7]),Double.parseDouble(eachLine[8])); 
						break;
					case "Truck":
						TruckTypes tt = TruckTypes.valueOf(eachLine[8]);
						v = new Truck(eachLine[1], Integer.parseInt(eachLine[2]), Double.parseDouble(eachLine[3]), Integer.parseInt(eachLine[4]), eachLine[5], Integer.parseInt(eachLine[6]), Integer.parseInt(eachLine[7]), tt);
						break;
					case "MotorCycle":
						v = new MotorCycle(eachLine[1], Integer.parseInt(eachLine[2]), eachLine[3], Integer.parseInt(eachLine[4]), Double.parseDouble(eachLine[5]), Integer.parseInt(eachLine[6]));
						break;
					case "Bicycle":
						v = new Bicycle(eachLine[1], Integer.parseInt(eachLine[2]), eachLine[3], Integer.parseInt(eachLine[4]), Integer.parseInt(eachLine[5]), Boolean.parseBoolean(eachLine[6]), Boolean.parseBoolean(eachLine[7])); //How do I convert boolean?
						break;
					default:
						System.out.println("No type identified");
						
				}
				addVehicle(v);
		}}
		catch(IOException e){
            System.out.println("Can't find the file !");
	}}
	
	public void printKinds(int selection)
	{
		
		switch(selection)
		{
		case 1:
			System.out.println("These are all of the vehicles");
			for(Vehicle v : vehiclesList) 
			{
				System.out.println(v);
			}
			break;
		case 2:
			System.out.println("These are all of the automobiles");
			for(Vehicle v : vehiclesList)
			{
				if (v instanceof Automobile) 
				{
					System.out.println(v);
				}
			}
			break;
		case 3:
			System.out.println("These are all of the two-wheelers");
			for(Vehicle v : vehiclesList)
			{
				if(v instanceof TwoWheeler)
				{
					System.out.println(v);
				}
			}
			break;
		case 4:
			System.out.println("These are all of the trucks");
			for(Vehicle v : vehiclesList)
			{
				if(v instanceof Truck)
				{
					System.out.println(v);
				}
			}
			break;
		case 5:
			System.out.println("These are all of the sedans");
			for(Vehicle v : vehiclesList)
			{
				if(v instanceof Sedan)
				{
					System.out.println(v);
				}
			}
			break;
		case 6:
			System.out.println("These are all of the bicycle");
			for(Vehicle v : vehiclesList)
			{
				if(v instanceof Bicycle)
				{
					System.out.println(v);
				}
			}
			break;
		case 7:
			System.out.println("These are all of the motorcycle");
			for(Vehicle v : vehiclesList)
			{
				if(v instanceof MotorCycle)
				{
					System.out.println(v);
				}
			}
			break;
		case 8:
			System.out.println("You pressed exit");
			System.exit(0);
			break;
		default:
			System.out.println("Please input numbers 1-8");
			
			
			
		}
		
	}
	
	
}
