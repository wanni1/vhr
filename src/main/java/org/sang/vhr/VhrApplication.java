package org.sang.vhr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication

public class VhrApplication {

	public static void main(String[] args) {
		SpringApplication.run(VhrApplication.class, args);
	}

}
