/**
 * 
 */
package com.devhat.estore.ProductsService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devhat.estore.ProductsService.entity.ProductLookupEntity;

/**
 * @author shyam
 *
 */
public interface ProductLookupRepsoitory extends JpaRepository<ProductLookupEntity, String> {
	ProductLookupEntity findByProductIdorTitle(String productId, String title);

}
