package net.chaofen.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动器
 * @author Louis
 * @date Jan 15, 2019
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"net.chaofen"})
public class ChaofenBackupApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChaofenBackupApplication.class, args);
	}
}