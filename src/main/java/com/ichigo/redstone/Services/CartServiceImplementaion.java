package com.ichigo.redstone.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ichigo.redstone.DAO.CartDao;
import com.ichigo.redstone.Model.Cart;
import com.ichigo.redstone.Model.Item;

@Service
public class CartServiceImplementaion implements CartService {


@Qualifier("cartDaoImplementation")
@Autowired
private CartDao cartDao; //dependency

	
	@Override
	public boolean addItem(int id) {
		// TODO Auto-generated method stub
		return cartDao.addItem(id);
	}

	@Override
	public boolean removeItem(int id) {
		// TODO Auto-generated method stub
		return cartDao.removeItem(id);
	}

	@Override
	public ArrayList<Cart> getAllItems() {
		System.out.println("returning all items");
		return cartDao.getCart();
	}

public CartServiceImplementaion() {
System.out.println("CartServiceImplementaion created....");
}
}