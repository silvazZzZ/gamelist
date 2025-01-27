package com.gamelist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.gamelist.entities")
public class GameListApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameListApplication.class, args);
	}

}
