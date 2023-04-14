package com.jbk.serviceIMPL;

import java.util.ArrayList;
import java.util.List;

import com.jbk.dao.ProductDao;
import com.jbk.daoIMPL.ProductDaoIMPL;
import com.jbk.model.Product;
import com.jbk.service.ProductService;

public class ProductServiceIMPL implements ProductService {

	ProductDao dao = new ProductDaoIMPL();
  
	@Override
	public String saveProduct(Product product) {
    String msg = dao.saveProduct(product);
		return msg;
	}

	@Override
	public Product getProductById(String productId) {
    Product product = dao.getProductById(productId);
		return product;
	}

	@Override
	public List<Product> getProduct() {
		List<Product> list = new ArrayList<Product>();
		list = dao.getProduct();
		return list;
	}

	@Override
	public String deleteProduct(String productId) {
		
		return dao.deleteProduct(productId);
		
		
	}

	@Override
	public Product updateProduct(Product product) {
		
		return dao.updateProduct(product);
	}

	@Override
	public List<Product> sortProductByIdASC() {
		// TODO Auto-generated method stub
		return dao.sortProductByIdASC();
	}

	@Override
	public List<Product> sortProductByName() {
		// TODO Auto-generated method stub
		return dao. sortProductByName();
	}

	@Override
	public Product productWithMaxPrice() {
		// TODO Auto-generated method stub
		return dao.productWithMaxPrice();
	}

	@Override
	public double producPriceSum() {
		// TODO Auto-generated method stub
		return dao.producPriceSum();
	}

	@Override
	public int totalProductCount() {
		// TODO Auto-generated method stub
		return dao.totalProductCount();
	}
}
