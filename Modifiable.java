package ToDoLists;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public interface Modifiable {

	public HashMap<String, Integer> getMap();

	

	public boolean hasItem(String item);

	public Set<String> getItems();

	public Collection<Integer> getAmounts();

	public int getAmount(String item);

	public void add(String item, int quantity);

	public void change(String item, int change);
	

	public void delete(String item);	

	public int getSize();
	
}//end of interface Modifiable
