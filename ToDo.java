  package ToDoLists;

import java.util.Set;


public abstract class ToDo implements Modifiable{
	//Attributes
	private String title;				//Title of the ToDo plan
	private int toDoID;					//ID of the ToDo plan
	private static int nextToDoID=1;	//Holds the next ID for the class.
	
	

	public ToDo() {
		title = "";
		toDoID = nextToDoID;
		nextToDoID = 1;
	}//end of constructor ToDo()

	public ToDo(String t) {
		title = t;
		toDoID = nextToDoID;
		nextToDoID = toDoID + nextToDoID;
	}//end of constructor ToDo(String)	

	public String getTitle() {
		return title;
	}//end of method getTitle()

	public int getToDoID() {
		return toDoID;
	}//end of method getToDoID()	


	public String setTitle(String s) {
		title = s;
		return title;
	}//end of method setTitle(String)
	

	public abstract Set<String> getItems();
	

	public abstract void add(String item, int quantity);


	public abstract void change(String item, int changeQty);
	

	public abstract void delete(String item);

	public abstract String toString();
	
}//end of class ToDo

