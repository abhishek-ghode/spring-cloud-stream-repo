package com.example.demo;

import java.util.Random;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.MessageBuilder;

public class Toll {
	private String statioId;
	private String customerId;
	private String timestamp;

	public String getStatioId() {
		return statioId;
	}

	public void setStatioId(String statioId) {
		this.statioId = statioId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Toll() {
		// TODO Auto-generated constructor stub
	}

	public Toll(String statioId, String customerId, String timestamp) {
		this.statioId = statioId;
		this.customerId = customerId;
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return statioId + "/" + customerId + "/" + timestamp;
	}
}
