package com.backend.core.electricity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectricityController {

	@RequestMapping("/ledger/electricity")
	public String getElectricityBill() {
		return "Rs 100";
	}
}
