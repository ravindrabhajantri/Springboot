package com.example.ravi.SayHello;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class SayHello {

	@Operation(summary = "Prints Generic Hello Message")
	@RequestMapping(method = RequestMethod.GET, path = "/hello", produces = "text/plain")
	String sayHello() {
		return "Hello there!!\n";
	}

	@Operation(summary = "Prints Hello Message with Special Mention of Given Name")
	@RequestMapping(method = RequestMethod.POST, path = "/hellocustom", produces = "text/plain", consumes = "text/plain")
	String sayHelloWithName(@RequestBody String name) {
		return "Hello "+name+" !!\n";
	}	
}
