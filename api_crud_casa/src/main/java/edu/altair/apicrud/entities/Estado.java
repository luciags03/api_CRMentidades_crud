package edu.altair.apicrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="estado")
public class Estado {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_estado")
	private int id_estado;
	
	@Column(name="nombre_estado", length=30, nullable=false)
	private String nombre_estado;
	
	@Column(name="descripcion_estado", length=500)
	private String descripcion_estado;

	public Estado() {
		super();
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public String getNombre_estado() {
		return nombre_estado;
	}

	public void setNombre_estado(String nombre_estado) {
		this.nombre_estado = nombre_estado;
	}

	public String getDescripcion_estado() {
		return descripcion_estado;
	}

	public void setDescripcion_estado(String descripcion_estado) {
		this.descripcion_estado = descripcion_estado;
	}
	
	
	
	
}
