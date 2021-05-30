/**
 * 
 */
package com.devhat.estore.ProductsService.controller;

import java.util.UUID;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devhat.estore.ProductsService.command.CreateProductCommand;
import com.devhat.estore.ProductsService.rest.model.CreateProductRestModel;

/**
 * @author shyam
 *
 */

@RestController
@RequestMapping("/products")  //http://localhost:8080/products 
public class ProductsController {
	
	private Environment env;
	
	@PostMapping
	public String createProduct(@RequestBody CreateProductRestModel createProductRestModel) {
		
		CreateProductCommand createProductCommand = CreateProductCommand.builder().price(createProductRestModel.getPrice())
		.quantity(createProductRestModel.getQuantity())
		.title(createProductRestModel.getTitle())
		.price(createProductRestModel.getPrice())
		.productId(UUID.randomUUID().toString()).build();
		
//		return "HTTP POST METHOD"+ "Running on SERVER PORT"+env.getProperty("local.server.port") ;
		
		return " HTTP POST METHOD" + "Title"+createProductRestModel.getTitle();
	}

}
