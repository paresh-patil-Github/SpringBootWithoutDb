package com.jbk.dao;

import com.jbk.model.Product;

public interface ProductDao {
	
	public String saveProduct(Product product);
	public Product getProductById(String productId);

}
