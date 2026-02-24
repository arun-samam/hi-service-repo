package com.aruns;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerApplication.class, args);
	}

	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) throws Exception {
		return "hello "+name+"  !!!"+"from@"+InetAddress.getLocalHost().getHostName();
		
	}
}
