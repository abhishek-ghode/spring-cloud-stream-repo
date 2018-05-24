package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*JSON data for postman

{"statioId":"80","customerId":"200","timestamp":"2018-05-12T03"}
*/

@RestController
public class FastPassRestController {
	
	@Autowired
	TollSource mysource;
	
	@RequestMapping(path="/toll", method=RequestMethod.POST)
	public String publishMessage(@RequestBody String payload) {
		
		System.out.println(payload);
		
		Random r = new Random();
		mysource.fastpassToll().send(MessageBuilder.withPayload(payload).setHeader("speed", r.nextInt(8) * 10).build());
		
		return "success";
	}

}
