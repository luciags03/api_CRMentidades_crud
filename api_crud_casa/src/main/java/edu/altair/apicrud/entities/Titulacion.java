package edu.altair.apicrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="titulacion")
public class Titulacion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_titulacion")
	private int id_titulacion;
	
	@Column(name="codigo_titulacion", length=50, unique=true, nullable=false)
	private String codigo_titulacion;
	
	@Column(name="diminutivo_titulacion", length=10, unique=true, nullable=false)
	private String diminutivo_titulacion;
	
	@Column(name="horas_totales_titulacion", length=5)
	private int horas_totales_titulacion;

	public Titulacion() {
		super();
	}

	public int getId_titulacion() {
		return id_titulacion;
	}

	public void setId_titulacion(int id_titulacion) {
		this.id_titulacion = id_titulacion;
	}

	public String getCodigo_titulacion() {
		return codigo_titulacion;
	}

	public void setCodigo_titulacion(String codigo_titulacion) {
		this.codigo_titulacion = codigo_titulacion;
	}

	public String getDiminutivo_titulacion() {
		return diminutivo_titulacion;
	}

	public void setDiminutivo_titulacion(String diminutivo_titulacion) {
		this.diminutivo_titulacion = diminutivo_titulacion;
	}

	public int getHoras_totales_titulacion() {
		return horas_totales_titulacion;
	}

	public void setHoras_totales_titulacion(int horas_totales_titulacion) {
		this.horas_totales_titulacion = horas_totales_titulacion;
	}
	
	
	
	
}

