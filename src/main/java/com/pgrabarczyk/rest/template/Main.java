package com.pgrabarczyk.rest.template;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
	log.info("main start");
	new AnnotationConfigApplicationContext(AppConf.class);
	log.info("main finish");
    }

}
