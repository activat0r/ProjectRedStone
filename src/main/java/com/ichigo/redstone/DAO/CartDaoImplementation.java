package com.ichigo.redstone.DAO;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ichigo.redstone.Data.CartDataMap;
import com.ichigo.redstone.Data.ItemsDataMap;
import com.ichigo.redstone.Model.Cart;
import com.ichigo.redstone.Model.Item;


@Repository
public class CartDaoImplementation implements CartDao {

	public CartDaoImplementation() {
		System.out.println("CartDaoImplementation created....");
	}

	@Override
	public boolean addItem(int itemID) {
		
		if (ItemsDataMap.INSTANCE.getAvailability(itemID)) {
			ItemsDataMap.INSTANCE.decreaseAvailability(itemID);
			if (CartDataMap.INSTANCE.getCart().contains(itemID)) {
				CartDataMap.INSTANCE.getCart().get(itemID).setCount(CartDataMap.INSTANCE.getCart().get(itemID).getCount()+1);
		}
			else {
				Cart cartItem = new Cart(itemID,1);
				CartDataMap.INSTANCE.getCart().add(cartItem);
			}
			return true;
		}
		
		return false;
		
	}

	
	@Override
	public boolean removeItem(int itemID) {
		
		if (CartDataMap.INSTANCE.getCart().contains(itemID) && CartDataMap.INSTANCE.getCart().get(itemID).getCount()>0 ) {
			ItemsDataMap.INSTANCE.increaseAvailability(itemID);
			CartDataMap.INSTANCE.getCart().get(itemID).setCount(CartDataMap.INSTANCE.getCart().get(itemID).getCount()-1);
			return true;
		}
		else		
		return false;
		
	}
	

	@Override
	public ArrayList<Cart> getCart() {
		System.out.println("retuning");
		return CartDataMap.INSTANCE.getCart();
	}

	

}
