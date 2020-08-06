package com.ichigo.redstone.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import com.ichigo.redstone.Model.Cart;

public enum CartDataMap {

INSTANCE;
	
private ArrayList<Cart> cartItemsList;


private CartDataMap() {
	cartItemsList=new ArrayList<>();

}

public void addItem(int itemID) {
	if(cartItemsList.contains(itemID)) {
		cartItemsList.get(itemID).setCount(cartItemsList.get(itemID).getCount() + 1);
	}
	else {
		Cart cartItem = new Cart(itemID,1);
		cartItemsList.add(cartItem);
	}	
	}

public ArrayList<Cart> getCart() {
	return cartItemsList;
}
	
}