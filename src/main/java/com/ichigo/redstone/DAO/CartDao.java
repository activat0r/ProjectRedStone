package com.ichigo.redstone.DAO;

import java.util.ArrayList;
import java.util.List;

import com.ichigo.redstone.Model.Cart;
import com.ichigo.redstone.Model.Item;

public interface CartDao {
	boolean addItem(int id);
	boolean removeItem(int id);
	ArrayList<Cart> getCart();
	}
		
