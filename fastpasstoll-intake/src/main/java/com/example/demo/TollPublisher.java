package com.example.demo;

import java.util.Random;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.MessageBuilder;

public class TollPublisher {

	class Toll {
		private String statioId;
		private String customerId;
		private String timestamp;

		public Toll(String statioId, String customerId, String timestamp) {
			this.statioId = statioId;
			this.customerId = customerId;
			this.timestamp = timestamp;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return statioId + "/"+ customerId+ "/"+ timestamp;
		}
	}

}
