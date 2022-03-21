package com.cursospringboot.curso.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cursospringboot.curso.configurations.Paginas;
import com.cursospringboot.curso.models.Post;

@Controller
@RequestMapping("/home")
public class ControllerBasic {
	
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
	
	@GetMapping(path = {"/post",""})
	public String saludar(Model model) {
		model.addAttribute("posts", this.posts());
		return "index";
	}
	
	//ejemplo igual a saludar pero con ModelAndView
	@GetMapping(path = {"/public"})
	public ModelAndView saludarMV() {
		ModelAndView mv = new ModelAndView(Paginas.HOME);
		mv.addObject("posts", this.posts());		
		return mv;
	}
	
	
}
