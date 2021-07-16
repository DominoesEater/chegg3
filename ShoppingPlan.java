package ToDoLists;


import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class ShoppingPlan extends ToDo {
	//Attributes
	private HashMap<String, Integer> items;		//HashMap that holds the items needed(key) and their quantities(value) for a Shopping Plan
	private String shoppingType;				//Describes the type of shopping to be done.  E.g. "Groceries", "Home Improvement", "Crafts", etc.
	
	//Constructors

	public ShoppingPlan() {
		super();
		shoppingType = "";
		items = new HashMap<String, Integer>();
	}//end of constructor ShoppingPlan()
	

	public ShoppingPlan(String t, String type) {
		super(t);
		shoppingType = type;
		items = new HashMap<String, Integer>();
	}//end of constructor ShoppingPlan(String)	
	
	
	//Methods

	public String getShoppingType() {
		return shoppingType;
	}//end of method getShoppingType()


	public void setShoppingType(String t) {
		shoppingType = t;
	}//end of method setShoppingType()

	public HashMap<String, Integer> getMap(){
		return items;
	}//end of method getMap()


	public boolean hasItem(String item) {
		if(items.containsKey(item)) {
			return true;
		}//end of if(gear.containsKey(item))
		return false;
	}//end of method hasItem(String)
	

	public Set<String> getItems(){
		return items.keySet();
	}//end of method getItems()
	

	public Collection<Integer> getAmounts(){
		return items.values();
	}//end of method getAmounts()
		

	public int getAmount(String item) {
		return items.getOrDefault(item, -1);
	}//end of method getAmount(String)
	

	public void add(String item, int quantity) {
		items.put(item, quantity);
	}//end of method add(String, int)
	

	public void change(String item, int change) {
		int current = items.get(item);
		items.put(item, current + change);
	}//end of method change(String, int)


	public void delete(String item) {
		items.remove(item);
	}//end of method delete(String)

	public int getSize() {
		return items.size();
	}//end of method getSize()


	public String toString() {
		String text = "";
		text = text + "\n--------------------------------------\n";
		text = text + String.format("%-25s%s\n",this.getTitle(), this.shoppingType);
		text = text + "--------------------------------------\n";		
		for(String item : items.keySet()) {
			text = text + String.format("  %-20s%8d\n",item, this.getAmount(item)); 
		}//end of for(String item : items.keySet())
		text = text + "--------------------------------------";				
		return text;
	}//end of method toString()
	
}//end of class ShoppingPlan
