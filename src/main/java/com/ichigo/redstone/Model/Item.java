package com.ichigo.redstone.Model;

import java.util.Random;

public class Item {

	private int itemId;
	private String itemName;
	private String itemDescription;
	private int itemCost=100;
	private int itemCount = 0;
	private int itemAvailability = 10;
	
	
	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public int getItemCost() {
		return itemCost;
	}


	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}


	public int getItemAvailability() {
		return itemAvailability;
	}


	public void setItemAvailability(int itemAvailability) {
		this.itemAvailability = itemAvailability;
	}


	
	public Item(String itemName, String itemDescription, int itemCost,
			int itemAvailability) {
		this.itemId = new Random().nextInt(100000);;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemCost = itemCost;
		this.itemAvailability = itemAvailability;
	}
	


}
