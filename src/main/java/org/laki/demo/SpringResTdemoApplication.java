package org.laki.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringResTdemoApplication {
	
	//No need for web.xml or @EnableWebMVC annotations

    public static void main(String[] args) {
        SpringApplication.run(SpringResTdemoApplication.class, args);
    }
}
