package com.jjimenezpj.pojos;
import java.io.Serializable;

/**
 * Pojo Curso
 */
public class Curso implements Serializable{

	private int id;

	private String titulo;

	private String activo;

	private String nivel;

	private int horas;

	private int idProfesor;


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

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	@Override
	public String toString() {
		return "Curso{" +
				"id=" + id +
				", titulo='" + titulo + '\'' +
				", activo='" + activo + '\'' +
				", nivel='" + nivel + '\'' +
				", horas=" + horas +
				", idProfesor=" + idProfesor +
				'}';
	}
}
