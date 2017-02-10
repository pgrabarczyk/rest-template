package com.pgrabarczyk.rest.template;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.pgrabarczyk.rest.template")
public class AppConf {

    @Bean
    public RestTemplate restTemplate() {
	return new RestTemplate();
    }
}
