package com.assignment;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demobank.springjwt.SpringBootSecurityJwtApplication;

/**
 * Rest API to get all the animals using Spring Boot
 * 
 * @author Yoga
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class TestController {

	@GetMapping("/getAllAnimals")
	public List<Animal> getAllAnimals() {
        return Solution.animals;
		}

}
