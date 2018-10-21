package br.org.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WsDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsDiscoveryApplication.class, args);
	}
}
