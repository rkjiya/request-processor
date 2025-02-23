package com.phonon.requestprocessor;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RequestProcessingApplication {

/*	@Bean
	public MessageConverter converter(){
		return new Jackson2JsonMessageConverter();
	}*/

	public static void main(String[] args) {
		SpringApplication.run(RequestProcessingApplication.class, args);
	}

}
