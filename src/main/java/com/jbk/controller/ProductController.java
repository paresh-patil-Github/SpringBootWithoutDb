package com.jbk.controller;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.model.Product;
import com.jbk.service.ProductService;
import com.jbk.serviceIMPL.ProductServiceIMPL;

@RestController
public class ProductController {

	ProductService service = new ProductServiceIMPL();
	Product product = null;

	@PutMapping("/save-product")
	public String saveProduct(@RequestBody Product product) {
		product.setProductId(UUID.randomUUID().toString());
		String msg = service.saveProduct(product);
		System.out.println(product);
		return msg;
	}
		
	@GetMapping("/get-allproduct")
	public List<Product> getProduct(){
		List<Product> list = service.getProduct();
		return list;
	}
	
	@GetMapping("/get-singleproduct")
	public Product getProductById(@RequestParam String productId){
		Product product = service.getProductById(productId);
		
		return product;
	}
	
	@DeleteMapping("/delete-product")
	public String deleteProduct(@RequestParam String productId) {
		
		return service.deleteProduct(productId);
		
		
	}

	@PostMapping("/update-product")
	public String updateProduct(@RequestBody Product product) {
		
		Product product1=service.updateProduct(product);
		
		if(product != null) {
			
			return "updated";
					
		}else {
			
			return "product not found for update";
		}
		
	}

	@GetMapping("/sort-ProductByIdASC")
	public List<Product> sortProductByIdASC() {
		// TODO Auto-generated method stub
		return service.sortProductByIdASC();
	}

	@GetMapping("/sort-ProductByName")
	public List<Product> sortProductByName() {
		// TODO Auto-generated method stub
		return service. sortProductByName();
	}

	@GetMapping("/get-productWithMaxPrice")
	public Product productWithMaxPrice() {
		// TODO Auto-generated method stub
		return service.productWithMaxPrice();
	}

	@GetMapping("/get-producPriceSum")
	public double producPriceSum() {
		// TODO Auto-generated method stub
		return service.producPriceSum();
	}

	@GetMapping("/get-totalProductCount")
	public int totalProductCount() {
		// TODO Auto-generated method stub
		return service.totalProductCount();
	}
}


