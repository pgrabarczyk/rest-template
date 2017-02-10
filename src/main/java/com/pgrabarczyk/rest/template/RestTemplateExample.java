package com.pgrabarczyk.rest.template;

import java.util.Collections;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.pgrabarczyk.rest.template.model.JSONPlaceholderResponseDTO;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RestTemplateExample {

    private String httpsUrl = "https://jsonplaceholder.typicode.com/posts/1";

    @Autowired
    private RestTemplate restTemplate;

    @PostConstruct
    public void getSSL() {
	log.debug("Trying HTTP GET on {}", httpsUrl);
	JSONPlaceholderResponseDTO response = restTemplate.getForObject(httpsUrl, JSONPlaceholderResponseDTO.class, Collections.emptyMap());
	log.debug(response.toString());
    }

}
