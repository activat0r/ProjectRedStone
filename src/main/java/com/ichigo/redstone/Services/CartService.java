package com.ichigo.redstone.Services;

import java.util.ArrayList;
import java.util.List;

import com.ichigo.redstone.Model.Cart;
import com.ichigo.redstone.Model.Item;

public interface CartService {
	boolean addItem(int id);
	boolean removeItem(int id);	
	ArrayList<Cart> getAllItems();
	}
		