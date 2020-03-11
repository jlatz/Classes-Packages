package apartment;

public class IllFormedCommercialBuildingException extends Exception{

	String reason;

	public IllFormedCommercialBuildingException(String error){
		reason = error;
	}

	@Override
	public String toString(){
		return "IllFormedCommercialBuilding " + reason;
	}
}
