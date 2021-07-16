
package ToDoLists;


import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class PackingPlan extends ToDo {
	//Attributes
	private HashMap<String, Integer> gear;		//HashMap that holds the items needed(key) and their quantities(value) for a Packing Plan
	private String destination;					//Destination of the trip
	private int travelers;						//How many travelers will be going on the trip
	private String tripType;					//Type of trip. E.g. "Business", "Vacation", "Sports", etc.

	public PackingPlan() {
		super();
		destination = "";
		travelers = 1;
		tripType = "";
		gear = new HashMap<String, Integer>();
	}//end of constructor PackingPlan()

	public PackingPlan(String t, String d, int people, String type) {
		super.setTitle(t);
		destination = d;
		travelers = people;
		tripType = type;
		gear = new HashMap<String, Integer>();
	}
	
	public String getDestination() {
		return destination;
	}//end of method getDestination()


	public int getTravelers() {
		return travelers;
	}//end of method getTravelers()
	

	public String getTripType() {
		return tripType;
	}//end of method getTripType()


	public void setDestination(String d) {
		destination = d;
	}//end of method setDestination()


	public void setTravelers(int t) {
		travelers = t;
	}//end of method setTravelers()


	public void setTripType(String t) {
		tripType = t;
	}//end of method setTripType()
	

	public HashMap<String, Integer> getMap(){
		return gear;
	}//end of method getMap()


	public boolean hasItem(String item) {
		if(gear.containsKey(item)) {
			return true;
		}//end of if(gear.containsKey(item))
		return false;
	}//end of method hasItem(String)

	public Set<String> getItems(){
		return gear.keySet();
	}//end of method getItems()
	

	public Collection<Integer> getAmounts(){
		return gear.values();
	}//end of method getAmounts()
		

	public int getAmount(String item) {
		return gear.getOrDefault(item, -1);
	}//end of method getAmount(String)
	

	public void add(String item, int quantity) {
		gear.put(item, quantity);
	}//end of method add(String, int)
	

	public void change(String item, int change) {
		int current = gear.get(item);
		gear.put(item, current + change);
	}//end of method change(String, int)
	

	public void delete(String item) {
		gear.remove(item);
	}//end of method delete(String)


	public int getSize() {
		return gear.size();
	}//end of method getSize()

	public String toString() {
		String text = "";
		text = text + "\n------------------------------------------\n";
		text = text + String.format("%-28sFor: %s\n",this.getTitle(), this.getTripType());
		text = text + String.format("%-28sTravelers: %d\n",("To: " + this.getDestination()), this.getTravelers());		
		text = text + "------------------------------------------\n";		
		for(String item : gear.keySet()) {
			text = text + String.format("  %-20s%8d\n",item, this.getAmount(item)); 
		}//end of for(String item : gear.keySet())
		text = text + "------------------------------------------";				
		return text;
	}//end of method toString()
	
	
}//end of class PackingPlan
