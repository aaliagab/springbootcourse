package com.cursospringboot.curso.services.implementations;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.cursospringboot.curso.SpringbootcourseApplication;
import com.cursospringboot.curso.models.Post;
import com.cursospringboot.curso.services.PostServices;

@Service("Post Services Validar ID")
public class PostServicesImplDos implements PostServices {
	private final Log log = LogFactory.getLog(getClass());

	@Override
	public List<Post> validation(List<Post> posts) {
		// TODO Auto-generated method stub
		System.out.println("Service 2");
		for (Post post : posts) {
			if (post.getId() < 1) {
				log.info("El ID no debe ser menor que 1");
				throw new NullPointerException("El ID no debe ser menor que 1");
			}
		}
		return posts;
	}

}
