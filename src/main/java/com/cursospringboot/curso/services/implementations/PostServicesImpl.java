package com.cursospringboot.curso.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cursospringboot.curso.models.Post;
import com.cursospringboot.curso.services.PostServices;

@Service("Post Services Impl")
public class PostServicesImpl implements PostServices{

	@Override
	public List<Post> validationTitulo(List<Post> posts) {
		// TODO Auto-generated method stub
		System.out.println("Service 1");
		for (Post post : posts) {
			if(post.getTitulo().equals(""))
				throw new NullPointerException("El titulo no debe ser vacio con PostServicesImpl");
		}
		return posts;
	}

}
