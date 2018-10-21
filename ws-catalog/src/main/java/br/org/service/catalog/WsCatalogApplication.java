package br.org.service.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@RestController
public class WsCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsCatalogApplication.class, args);
	}
	
	
	
	@GetMapping(value = "list")
	public String[] getlist() {
		
		return new String[]{"Item 1","Item 2"};
	}

	
}
