package com.backend.core.bills.telephone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelephoneController {

	@RequestMapping("/ledger/telephone")
	public String getTelelphoneBill() {
		return "Rs 250";
	}
	
}
