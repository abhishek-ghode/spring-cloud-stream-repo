package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.ServiceActivator;

@EnableBinding(Sink.class)
@SpringBootApplication
public class FastpasstollIntakeApplication {
	public static void main(String[] args) {
		SpringApplication.run(FastpasstollIntakeApplication.class, args);
	}
	
//	@StreamListener(Sink.INPUT)
	@ServiceActivator(inputChannel=Sink.INPUT)
	public void log(String message){
		System.out.println(message);
	}
	
	
	
	
	
}
