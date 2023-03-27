package com.jbk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.model.Product;
import com.jbk.service.ProductService;
import com.jbk.serviceIMPL.ProductServiceIMPL;

@RestController
public class ProductController {
	
	ProductService service = new ProductServiceIMPL();
	
	@PostMapping("/save-product")
	public String saveProduct(@RequestBody Product product) {
		
		String msg = service.saveProduct(product);
		return msg;
	}
	
	@GetMapping("/get-allproduct")
	public List<Product> getProduct(){
		List<Product> list = new ArrayList();
		list = service.getProduct();
		return list;
	}
	
	@GetMapping("/get-singleproduct")
	public Product getProductById(@PathVariable String productId){
		Product product = service.getProductById(productId);
		return product;
	}

}
