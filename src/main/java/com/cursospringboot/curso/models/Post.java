package com.cursospringboot.curso.models;

import java.util.Date;

public class Post {
	private int id;
	private String titulo, descripcion, urlImg;
	private Date fecha;
		
	public Post() {
		
	}
	
	public Post(int id, String titulo, String descripcion, String urlImg, Date fecha) {
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.urlImg = urlImg;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
