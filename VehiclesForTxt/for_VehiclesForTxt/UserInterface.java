package for_VehiclesForTxt;

import java.util.Scanner;

public class UserInterface {

	public void mainLoop(VehiclesList lc)
	{
		while(true)
		{
			System.out.print("To see all vehicles, press 1\n" +
					"To see all automobiles, press 2\n" +
					"To see all two-wheelers, press 3\n" +
					"To see all trucks, press 4\n" +
					"To see all sedans, press 5\n" +
					"To see all bicycles, press 6\n" +
					"To see all motorcycles, press 7\n" +
					"To exit prgram, press 8\n");
			Scanner scan = new Scanner(System.in);
			try {
				int input = Integer.parseInt(scan.nextLine());
				if(input == 1)
				{
					lc.printKinds(input);
				} else if(input ==2)
				{
					lc.printKinds(input);
				} else if(input == 3)
				{
					lc.printKinds(input);
				} else if(input == 4)
				{
					lc.printKinds(input);
				} else if(input == 5)
				{
					lc.printKinds(input);
				} else if(input == 6)
				{
					lc.printKinds(input);
				} else if(input == 7)
				{
					lc.printKinds(input);
				} else if(input == 8)
				{
					lc.printKinds(input);
				}	
			}catch(NumberFormatException n)
			{
				System.out.println("Please enter a number 1-8!");
			}
			
		}
		
	}
	
}
