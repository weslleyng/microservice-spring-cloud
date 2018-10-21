package br.org.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class WsProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsProxyApplication.class, args);
	}
	
	@GetMapping(value = "/")
	public String test() {
		return "teste passou";
	}

}
