package com.jbk.serviceIMPL;

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
		
		return null;
	}

}
