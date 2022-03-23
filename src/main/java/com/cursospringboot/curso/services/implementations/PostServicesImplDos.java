package com.cursospringboot.curso.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cursospringboot.curso.models.Post;
import com.cursospringboot.curso.services.PostServices;

@Service("Post Services ImplDos")
public class PostServicesImplDos implements PostServices{

	@Override
	public List<Post> validationTitulo(List<Post> posts) {
		// TODO Auto-generated method stub
		System.out.println("Service 2");
		for (Post post : posts) {
			if(post.getTitulo().equals(""))
				throw new NullPointerException("El titulo no debe ser vacio con PostServicesImplDos");
		}
		return posts;
	}

}
