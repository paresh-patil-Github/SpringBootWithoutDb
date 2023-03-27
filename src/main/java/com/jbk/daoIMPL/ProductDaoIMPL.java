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
		Product product = new  Product();
		for(int i=0;list.size()>i;i++) {
			if(list.get(i).getProductId().equals(productId))
				product = list.get(i);
		}
		return product;
	}

	@Override
	public List<Product> getProduct() {
		List<Product> list2 = new ArrayList<Product>();
		int i= 0;
		while(list.size()!=0) {
			
			list2.add(list.get(i));
			i++;
		}
		return list2;
	}

}
