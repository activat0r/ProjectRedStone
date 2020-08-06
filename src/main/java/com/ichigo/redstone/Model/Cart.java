package com.ichigo.redstone.Model;

public class Cart {

	public Cart(int itemId, int count) {
		super();

		this.itemId = itemId;
		this.count = count;
	}
	private int itemId;
	private int count;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	public boolean equals(int cartItem) {
		return (this.itemId== cartItem);
	}
	
	
}
