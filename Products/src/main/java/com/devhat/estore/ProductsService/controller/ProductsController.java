/**
 * 
 */
package com.devhat.estore.ProductsService.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shyam
 *
 */

@RestController
@RequestMapping("/products")  //http://localhost:8080/products 
public class ProductsController {
	
	@PostMapping
	public String createProduct() {
		return "HTTP POST METHOD";
	}

}
