package com.jbk.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.model.Product;
import com.jbk.service.ProductService;
import com.jbk.serviceIMPL.ProductServiceIMPL;

@RestController
public class ProductController {

	ProductService service = new ProductServiceIMPL();
	Product product = null;

	@PostMapping("/save-product")
	public String saveProduct(@RequestBody Product product) {

		String msg = service.saveProduct(product);

		return msg;

	}
	
	@RequestMapping("/get-product/{id}")
	public Product getProductById(@PathVariable String productId) {

		product = service.getProductById(productId);
		return product;

	}

}
