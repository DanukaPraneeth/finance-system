package com.backend.core.waterbill;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaterBillControler {

	@RequestMapping("/ledger/waterbill")
	public List<WaterBill> getWaterBill() {
		return Arrays.asList(
				new WaterBill("2018.07.10","Rs 750","Bill 1"),
				new WaterBill("2018.08.10","Rs 578","Bill 2"),
				new WaterBill("2018.09.10","Rs 1068","Bill 3")
				);
	}
}