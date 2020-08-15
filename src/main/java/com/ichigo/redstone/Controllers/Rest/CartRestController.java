package com.ichigo.redstone.Controllers.Rest;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ichigo.redstone.Services.CartService;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/rest")
@RestController
public class CartRestController {
	
	
	@Autowired
	private CartService cartService; // dependency

	
	public CartRestController() {
	System.out.println("Cart Controller created....");
	}
	
	@ApiResponses({
		@ApiResponse(code=405,message="Invalid request"),
		@ApiResponse(code=404,message="Error 404 : The page you are trying to reach cannot be found!"),
		@ApiResponse(code=401,message="You are not authorized to view this page"),
		@ApiResponse(code=403,message="Authentication error! Please confirm your credentials"),
		@ApiResponse(code=500,message="We are facing some issues. Please try again later."),
	})
	

	@ApiOperation("GET SINGLE ITEM")
	@GetMapping("/getItem")
	public String hiSoloGET(){
		return "Listing single product in cart";
	}

	
	@ApiOperation("Get all items in cart")
	@GetMapping("/getItems")
	public String hiGET(){
		return "Listing all products in cart";
	}
	
	@ApiOperation("Checkout with the cart contents")
	@PostMapping("/checkout")
	public String hiPOST(){
		return "checking out with products";
	}
	
	@ApiOperation("Remove items from the cart")
	@DeleteMapping("/removeItems")
	public String hiDELETE(){
		return "deleting from cart";
	}
	
	@ApiOperation("Add items to the cart")
	@PutMapping("/addItems")
	public String hiPUT(){
		return "Adding Items to Cart";
	}
	
}
