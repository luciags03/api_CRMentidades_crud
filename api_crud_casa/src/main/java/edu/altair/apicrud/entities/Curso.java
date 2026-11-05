package edu.altair.apicrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que el ID se genera automáticamente
	@Column(name="id_curso")
	private int id_curso;
	
	@Column(name="diminutivo_curso", length=10, unique=true, nullable=false)
	private String diminutivo_curso;
	
	@Column(name="descripcion_curso", length=500)
	private String descripcion_curso;

	
	
	public Curso() {
		super();
	}

	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	public String getDiminutivo_curso() {
		return diminutivo_curso;
	}

	public void setDiminutivo_curso(String diminutivo_curso) {
		this.diminutivo_curso = diminutivo_curso;
	}

	public String getDescripcion_curso() {
		return descripcion_curso;
	}

	public void setDescripcion_curso(String descripcion_curso) {
		this.descripcion_curso = descripcion_curso;
	}
	
	
	

}
