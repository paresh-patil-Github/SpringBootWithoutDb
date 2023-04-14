package com.jbk.dao;

import java.util.List;

import com.jbk.model.Product;

public interface ProductDao {
	
	public String saveProduct(Product product);
	public Product getProductById(String productId);
	public List<Product> getProduct();
	public String deleteProduct(String productId);
	public Product updateProduct(Product product);
	public List<Product> sortProductByIdASC();
	public List<Product> sortProductByName();
	public Product productWithMaxPrice();
	public  double producPriceSum();
	public int totalProductCount();
	
			

}
