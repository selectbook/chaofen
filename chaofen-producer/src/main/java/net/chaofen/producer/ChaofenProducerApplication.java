package net.chaofen.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ChaofenProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChaofenProducerApplication.class, args);
	}
}