package apartment;

//if files were in another location: import apartment.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class ApartmentBuildingInventory{
	public static void main(String...args){
		//ArrayList<ApartmentBuilding> apartmentList = new ArrayList<>();
		ApartmentBuilding[] apartmentList = new ApartmentBuilding[20];
		Scanner kb = new Scanner(System.in);
		int i = 0;
		while(true){
			System.out.print("Please choose one of the following options:\n");
			System.out.print("1. Add apartment building\n2. Print inventory\n3. Exit\n");
			int option = kb.nextInt();
			switch(option){
				case 1: 
					System.out.print("Please enter ther number of units, the street address, and if it is a penthouse or not\n");
					int numUnits = kb.nextInt();
					String extra = kb.nextLine();
					String streetAddress = kb.nextLine();
					boolean penthouse = kb.nextBoolean();	
					try{
						apartmentList[i] = new ApartmentBuilding(penthouse, numUnits, streetAddress);
						i++;
					}catch (IllFormedCommercialBuildingException e){
						System.out.println(e.toString());
					}	
					//System.out.println(Arrays.toString(apartmentList));
					break;
				case 2:
					int j = 0;
					while(apartmentList[j] != null){
						System.out.printf("The number of units is %d, The address is %s, If it is a penthosue is %b\n",apartmentList[j].numUnits, apartmentList[j].streetAddress, apartmentList[j].penthouse);
						j++;
						
					}		
					break;
				case 3:
					return;
			}
		}
			 
	
	}
}
