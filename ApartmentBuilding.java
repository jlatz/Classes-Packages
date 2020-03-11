package apartment;

public class ApartmentBuilding extends CommercialBuilding{
	boolean penthouse;

	public ApartmentBuilding(boolean penthouse, int numUnits, String streetAddress) throws IllFormedCommercialBuildingException{
		super(numUnits, streetAddress);
		this.penthouse = penthouse;

	}
}
	
