package com.cursospringboot.curso.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cursospringboot.curso.models.Post;
import com.cursospringboot.curso.services.PostServices;

@Service("Post Services Validar ID")
public class PostServicesImplDos implements PostServices{

	@Override
	public List<Post> validation(List<Post> posts) {
		// TODO Auto-generated method stub
		System.out.println("Service 2");
		for (Post post : posts) {
			if(post.getId()<1)
				throw new NullPointerException("El ID no debe ser menor que 1");
		}
		return posts;
	}

}
