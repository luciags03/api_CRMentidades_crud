package edu.altair.apicrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="modulo")
public class Modulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_modulo")
	private Long id_modulo;
	
	@Column(name="codigo_modulo", length=100, nullable=false, unique=true)
	private String codigo_modulo;
	
	@Column(name="diminutivo_modulo", length=10, nullable=false, unique=true)
	private String diminutivo_modulo;
	
	@Column(name="nombre_modulo", length=50, nullable=false)
	private String nombre_modulo;
	
	@Column(name="descripcion_modulo", length=500)
	private String descripcion_modulo;
	
	@Column(name="horas_semanales", length=2)
	private int horas_semanales;
	
	@Column(name="creditos", length=2)
	private int creditos;
	
	

	public Modulo() {
		super();
	}

	public Long getId_modulo() {
		return id_modulo;
	}

	public void setId_modulo(Long id_modulo) {
		this.id_modulo = id_modulo;
	}

	public String getCodigo_modulo() {
		return codigo_modulo;
	}

	public void setCodigo_modulo(String codigo_modulo) {
		this.codigo_modulo = codigo_modulo;
	}

	public String getDiminutivo_modulo() {
		return diminutivo_modulo;
	}

	public void setDiminutivo_modulo(String diminutivo_modulo) {
		this.diminutivo_modulo = diminutivo_modulo;
	}

	public String getNombre_modulo() {
		return nombre_modulo;
	}

	public void setNombre_modulo(String nombre_modulo) {
		this.nombre_modulo = nombre_modulo;
	}

	public String getDescripcion_modulo() {
		return descripcion_modulo;
	}

	public void setDescripcion_modulo(String descripcion_modulo) {
		this.descripcion_modulo = descripcion_modulo;
	}

	public int getHoras_semanales() {
		return horas_semanales;
	}

	public void setHoras_semanales(int horas_semanales) {
		this.horas_semanales = horas_semanales;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	
	
}
