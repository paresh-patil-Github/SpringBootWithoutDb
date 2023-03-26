package com.jbk.daoIMPL;

import java.util.ArrayList;
import java.util.List;

import com.jbk.dao.ProductDao;
import com.jbk.model.Product;

public class ProductDaoIMPL implements ProductDao {

	List<Product> list = new ArrayList();
	@Override
	public String saveProduct(Product product) {
		list.add(product);
		return "Product is saved!";
	}

	@Override
	public Product getProductById(String productId) {
		return null;
	}

}
