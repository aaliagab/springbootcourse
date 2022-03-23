package com.cursospringboot.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cursospringboot.curso.componets.PostComponent;
import com.cursospringboot.curso.services.PostServices;

@SpringBootApplication
public class SpringbootcourseApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("com.cursospringboot.curso.componets.PostComponent")
	public PostComponent postComponent;
	
	@Autowired
	@Qualifier("Post Services ImplDos")
	public PostServices postServices;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootcourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*postComponent.posts().forEach(p->{
			System.out.println(p.getTitulo());
		});*/
		postServices.validationTitulo(postComponent.posts());
	}

}
