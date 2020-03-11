package apartment;

public class CommercialBuilding{
	
	int numUnits;
	String streetAddress = " ";

	CommercialBuilding(int numUnits, String streetAddress) throws IllFormedCommercialBuildingException{
		if(numUnits < 1){
			throw new IllFormedCommercialBuildingException("Number of units is less than 1");
		}else{			
			this.numUnits = numUnits;
		}

		if(streetAddress.isEmpty() || streetAddress.equals(" ")){
			throw new IllFormedCommercialBuildingException("Street address is not vaild");
		}else{
			this.streetAddress = streetAddress;
		}
	}
}
