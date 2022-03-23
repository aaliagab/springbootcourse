package com.cursospringboot.curso.services.implementations;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cursospringboot.curso.SpringbootcourseApplication;
import com.cursospringboot.curso.models.Post;
import com.cursospringboot.curso.services.PostServices;

@Service("PostServices Decorado")
//@Scope("singleton") esta es otra forma
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PostServicesImplDecorado implements PostServices{
	private final Log log = LogFactory.getLog(getClass());
	
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
			if(post.getDescripcion().equals("")) {
				log.info("La descripcion no debe ser vacia");
				throw new NullPointerException("La descripcion no debe ser vacia");
			}
			if(post.getFecha()==null) {
				log.info("La fecha no debe ser vacia");
				throw new NullPointerException("La fecha no debe ser vacia");
			}
		}
		return posts;
	}
	
}
