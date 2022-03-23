package com.cursospringboot.curso.componets;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cursospringboot.curso.models.Post;

@Component("com.cursospringboot.curso.componets.PostComponent")
public class PostComponent {
	public List<Post> posts(){
		List<Post> postss = new ArrayList<>();
		postss.add(new Post(1,"Spring Boot","Spring Boot is an open source Java-based framework used to create a micro Service.",
				"http://localhost/img/1.jpg",new Date()));
		postss.add(new Post(2,"Spring Boot2","Spring Boot is an open source Java-based framework used to create a micro Service.",
				"http://localhost/img/1.jpg",new Date()));
		postss.add(new Post(3,"Spring Boot3","Spring Boot is an open source Java-based framework used to create a micro Service.",
				"http://localhost/img/1.jpg",new Date()));
		return postss;
		
	}
}
