package com.example.demo;

import java.util.Random;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.MessageBuilder;

//@EnableBinding(Source.class)
@EnableBinding(TollSource.class)
public class TollPublisher {

	/*
	 * @InboundChannelAdapter(channel=Source.OUTPUT) public String
	 * sendTollCharge(){ return
	 * "{station:\"20\",customerid:\"100\",timestamp:\"2018-05-12T03:15:00\"}";
	 * }
	 */
	
	
	Random r = new Random();

	@Bean
	@InboundChannelAdapter(channel = "fastpassTollChannel"/*, poller = @Poller(fixedDelay = "2000")*/)
	public MessageSource<Toll> sendTollCharge() {

		// return () -> MessageBuilder.withPayload(new Toll("20", "100",
		// "2018-05-12T03:15:00")).build();
		return () -> MessageBuilder.withPayload(new Toll("20", "100", "2017-07-12T12:04:00"))
				.setHeader("speed", r.nextInt(8) * 10).build();

	}
	
	class Toll {
		private String statioId;
		private String customerId;
		private String timestamp;

		public Toll(String statioId, String customerId, String timestamp) {
			this.statioId = statioId;
			this.customerId = customerId;
			this.timestamp = timestamp;
		}

	}

}
