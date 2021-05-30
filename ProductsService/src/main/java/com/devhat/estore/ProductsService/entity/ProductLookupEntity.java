/**
 * 
 */
package com.devhat.estore.ProductsService.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shyam
 *
 */

@AllArgsConstructor
@Data
@Entity
@Table(name="productlookup")
public class ProductLookupEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2897724960951388491L;
	
	@Id
	@Column(unique = true)
	private  String productId;
	@Column(unique = true)
	private  String title;

}
