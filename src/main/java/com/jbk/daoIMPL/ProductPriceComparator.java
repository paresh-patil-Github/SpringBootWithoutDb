package com.jbk.daoIMPL;

import java.util.Comparator;

import com.jbk.model.Product;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		if(o1.getProductPrice()==o2.getProductPrice()) {  
			
			return 0;  
		}
		else if(o1.getProductPrice()>o2.getProductPrice()) {  
				
			return -1;  
		}
		else {  
				
			return 1;  
		}  
	}
}


