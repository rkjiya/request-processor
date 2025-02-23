package com.phonon.requestprocessor.model;

import com.phonon.requestprocessor.enums.RequestStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RequestReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(RequestReceiver.class);


    private final RestTemplate restTemplate;

    public RequestReceiver(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @RabbitListener(queues = { "${rabbitmq-phonon-queue}"})
    public void receiveMessage(RequestData requestData) throws InterruptedException {
        LOGGER.info("Processing request....: {}", requestData);
        Thread.sleep(2000);
        restTemplate.postForEntity(requestData.getUrl(), requestData, RequestData.class);
    }
}
