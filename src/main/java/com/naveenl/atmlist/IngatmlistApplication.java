package com.naveenl.atmlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.naveenl.atmlist.dao.AtmListDAO;
import com.naveenl.atmlist.dao.DefaultAtmDAO;

@SpringBootApplication
public class IngatmlistApplication {

	@Bean
    protected AtmListDAO atmListDAO() {
        return new DefaultAtmDAO();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(IngatmlistApplication.class, args);
	}
}
