import java.util.ArrayList;

public class DotCom {
	int [] locationCells;
	int numOfHits = 0;
	
	private ArrayList<String> locationCell;
	private int numOfHits;
	
	public void setLocationCells (ArrayList<String> loc) {
		locationCells = loc;
		
	}
	
	public String checkYourself(String UserInput) {
		String result = "miss";
		
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0) {
			
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			} 
		} 
		
		return result;
	}
}