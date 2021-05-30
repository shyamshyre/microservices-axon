package com.devhat.estore.ProductsService.events.handler;

/**
 * @Processing group : This will logically group different event handlers that are 
 * related to each other and they both are product-related events., We will annotate
 * the class with @ProcessingGroup and the other classes with same annotation.
 */

import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

import com.devhat.estore.ProductsService.core.events.ProductCreatedEvent;
import com.devhat.estore.ProductsService.entity.ProductLookupEntity;
import com.devhat.estore.ProductsService.repository.ProductLookupRepsoitory;

@Component
@ProcessingGroup("product-group")
public class ProductLookupEventsHandler {

	private final ProductLookupRepsoitory productLookupRepsoitory;
	
	public ProductLookupEventsHandler(ProductLookupRepsoitory productLookupRepsoitory) {
		this.productLookupRepsoitory = productLookupRepsoitory;
	}
	
	@EventHandler
	public void on (ProductCreatedEvent event) {
		ProductLookupEntity productLookupEntity = new ProductLookupEntity(event.getProductId(), event.getTitle());
		productLookupRepsoitory.save(productLookupEntity);
	}
}
