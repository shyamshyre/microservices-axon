/**
 * 
 */
package com.devhat.estore.ProductsService.rest.model;

import java.math.BigDecimal;

import lombok.Data;

/**
 * @author shyam
 *
 */

@Data
public class CreateProductRestModel {
	private String title;
	private int quantity;
	private BigDecimal price;

}
