package com.bryceblankinship.eventful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bryce Blankinship (https://github.com/bryceblankinship)
 * I am the author of every file in this repository
 */

@RestController
@SpringBootApplication
public class EventfulApplication {

	@RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	String home(){
		return "<p>You found the Eventful backend! You probably don't want to be here though :(</p>";
	}

	public static void main(String[] args) {
		SpringApplication.run(EventfulApplication.class, args);
	}

}
