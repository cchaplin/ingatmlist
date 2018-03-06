package com.naveenl.atmlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.naveenl.atmlist.dao.AtmListDAO;
import com.naveenl.atmlist.dao.DefaultAtmDAO;

@SpringBootApplication
public class IngatmlistApplication extends SpringBootServletInitializer {

	@Bean
    protected AtmListDAO atmListDAO() {
        return new DefaultAtmDAO();
    }
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(IngatmlistApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(IngatmlistApplication.class, args);
	}
}
