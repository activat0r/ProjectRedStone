package com.ichigo.redstone.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import com.ichigo.redstone.Model.Cart;
import com.ichigo.redstone.Model.Item;

public enum CartDataMap {

INSTANCE;
	
private ArrayList<Cart> cartItemsList;


private CartDataMap() {
	cartItemsList=new ArrayList<>();
	Cart item1=new Cart(1,10);
	Cart item2=new Cart(2,5);
	Cart item3=new Cart(3,1);


	cartItemsList.add(item1);
	cartItemsList.add(item2);
	cartItemsList.add(item3);
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
	System.out.println("cartitemslist datamap  "+cartItemsList.size());
	return cartItemsList;
}
	
}