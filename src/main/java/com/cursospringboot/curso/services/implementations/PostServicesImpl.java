package com.cursospringboot.curso.services.implementations;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.cursospringboot.curso.SpringbootcourseApplication;
import com.cursospringboot.curso.models.Post;
import com.cursospringboot.curso.services.PostServices;

@Service("Post Services Validar Titulo")
public class PostServicesImpl implements PostServices{
	private final Log log = LogFactory.getLog(getClass());
	
	@Override
	public List<Post> validation(List<Post> posts) {
		// TODO Auto-generated method stub
		System.out.println("Service 1");
		for (Post post : posts) {
			if(post.getTitulo().equals("")) {
				log.info("El titulo no debe ser vacio");
				throw new NullPointerException("El titulo no debe ser vacio");
			}
		}
		return posts;
	}

}
