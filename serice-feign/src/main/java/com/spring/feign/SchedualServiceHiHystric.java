package com.spring.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

	public String sayHiFromClientOne(String name) {
		return "sorry " + name;
	}

}
