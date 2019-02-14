package com.springcloud;

import org.springframework.stereotype.Controller;

@Controller
public class RateController {
	
	String rate;
	String lanecount;
	String tollstart;	
	
	public String getRate(Model m) {
		m.addAttribute("rateamount",rate);
		m.addAttribute("lanes",lanes);
	}
}
