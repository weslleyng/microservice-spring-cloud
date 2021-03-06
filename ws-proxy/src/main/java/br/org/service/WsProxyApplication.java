package br.org.service;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableSwagger2
public class WsProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsProxyApplication.class, args);
	}
	
	@GetMapping(value = "/")
	public String test() {
		return "teste passou";
	}

	
	@GetMapping(value = "/test")
	public String testString() {
		return "String da sorte? \n\rSorte: "+UUID.randomUUID().toString();
	}
}
