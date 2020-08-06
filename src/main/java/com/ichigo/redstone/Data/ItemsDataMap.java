package com.ichigo.redstone.Data;

import java.util.HashMap;
import java.util.Map;

import com.ichigo.redstone.Model.Item;

public enum ItemsDataMap {

INSTANCE;
	
private Map<Integer,Item> map;

private ItemsDataMap() {
map=new HashMap<>();
Item item1=new Item("OnePlus Nord","OnePlus Mobile Phone",27000,10);


Item item2=new Item("OnePlus 7t","OnePlus Mobile Phone",3800,5);


Item item3=new Item("LG Washing Machine","Washing Machine",15000,3);


map.put(item1.getItemId(),item1);
map.put(item2.getItemId(),item2);
map.put(item3.getItemId(),item3);
	
}
	

public Map<Integer, Item> getMap() {
	return map;
}

public void decreaseAvailability(int itemID) {
	Item item = map.get(itemID);
	item.setItemAvailability(item.getItemAvailability() - 1);
}
	
public void increaseAvailability(int itemID) {
	Item item = map.get(itemID);
	item.setItemAvailability(item.getItemAvailability() + 1);
}

public boolean getAvailability(int itemID) {
	if(map.get(itemID).getItemAvailability() > 0)
		return true;
	else 
		return false;
}


}