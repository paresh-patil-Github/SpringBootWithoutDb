package com.jbk.daoIMPL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.jbk.dao.ProductDao;
import com.jbk.model.Product;

public class ProductDaoIMPL implements ProductDao {

	List<Product> list = new ArrayList();
	
	public ProductDaoIMPL() {
		list.add(new Product("1", "XYZ", 1,1, 10, 10));
		list.add(new Product("2", "abc", 1,1, 10, 12));
		list.add(new Product("3", "pqr", 1,1, 10, 15));
	}

	@Override
	public String saveProduct(Product product) {
		list.add(product);
		return "Product is saved!";
	}

	@Override
	public Product getProductById(String productId) {
		for (Product product : list) {
			if (productId.equals(product.getProductId())) {
				return product;
			}
		}
		return null;
		
}
	@Override
	public List<Product> getProduct() {
		if(!list.isEmpty()) {
			return list;
		}else {
			return null;
		}
	}

	
	//delete product
	@Override
	public String deleteProduct(String productId) {
		
		//Product prod=null;
		
		for (Product product : list) {
		
			if (productId.equals(product.getProductId())) {
				
				//prod=product;
			
				list.remove(product);
				
				return "the product is deleted";
			}
	}
		return "product not found for delete";
	}
	
	
	
	// Upadate product 
	@Override
	public Product updateProduct(Product product) {
		
		
		boolean isUpdated=false;
		
		for (Product product2 : list) {
			
			if (product2.getProductId().equals(product.getProductId())) {
				
				list.set(list.indexOf(product2), product);
				
				isUpdated=true;
		}
		
		}if(isUpdated) {
			return product;
		}
		else {
			return null;
		}
	}
	
	//sort product byId -ascending
	@Override
	public List<Product> sortProductByIdASC(){
		
		Collections.sort(list , new ProductIdComparator());
		
		return list;
	}
	
	//sort product by name-desc
	@Override
	public List<Product> sortProductByName(){
		
		Collections.sort(list , new ProductNameComparator());
		
		return list;
	}
	
	//product with maxprice
	@Override
	public Product productWithMaxPrice() {
		
		Collections.sort(list , new ProductPriceComparator());
		
		return list.get(0);
	}
	
	
	//to count the sum of product price
	@Override
	public  double producPriceSum() {
		
		double sum=0.0;
		
		for (Product product : list) {
			sum+=product.getProductPrice();
		}
		
		return sum;
	}
	
	
	// to get total count of product
	@Override
	public int totalProductCount() {
		
		return list.size();
	}
	
//	
//	public static void main(String[] args) {
//		
//		ProductDaoIMPL pm = new ProductDaoIMPL();
//		
//		System.out.println(pm.producPriceSum());
//		
//	}
}
