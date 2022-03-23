package com.cursospringboot.curso.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursospringboot.curso.models.Post;
import com.cursospringboot.curso.services.PostServices;

@Service("PostServices Decorado")
public class PostServicesImplDecorado implements PostServices{
	@Autowired
	private PostServicesImpl psImpl;
	
	@Autowired
	private PostServicesImplDos psImplDos;
	
	@Override
	public List<Post> validation(List<Post> posts) {
		// TODO Auto-generated method stub
		posts = psImpl.validation(posts);
		posts = psImplDos.validation(posts);
		System.out.println("Service Decorado");
		for (Post post : posts) {
			if(post.getDescripcion().equals(""))
				throw new NullPointerException("La descripcion no debe ser vacia");
			if(post.getFecha()==null)
				throw new NullPointerException("La fecha no debe ser vacia");
		}
		return posts;
	}
	
}
