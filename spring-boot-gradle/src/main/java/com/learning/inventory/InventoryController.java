package com.learning.inventory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.learning.inventory.constants.*;

@RestController
public class InventoryController {

	@RequestMapping("/learningAws")
	public String getAWS() {
		return InventoryConstants.LEARNINGAWS;
	}

	@RequestMapping("/docker")
	public String getDocker() {
		return InventoryConstants.LEARNINGDOCKER;
	}

	@RequestMapping()
	public String getDefault() {
		return InventoryConstants.DEFAULTAPI;
	}
	
	@RequestMapping("*")
	public String getFallback() {
		return InventoryConstants.FALLBACKAPI;
	}
}