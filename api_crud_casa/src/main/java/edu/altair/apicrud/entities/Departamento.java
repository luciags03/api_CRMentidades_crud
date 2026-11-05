package edu.altair.apicrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "departamento" )
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que el ID se genera automáticamente
	@Column(name= "id_departamento")
	private long id_departamento;
	
	@Column(name="codigo_departamento", nullable= false, length=100, unique=true)
	private String codigo_departamento;
	
	@Column(name="nombre_departamento", nullable= false, length=100)
	private String nombre_departamento;
	
	@Column(name="descripcion", nullable= true, length=500)
	private String descripcion;
	
	@Column(name="tlf_departamento", nullable=true, length=100)
	private long tlf_departamento;

	public Departamento() {
		super();
	}

	public long getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(long id_departamento) {
		this.id_departamento = id_departamento;
	}

	public String getCodigo_departamento() {
		return codigo_departamento;
	}

	public void setCodigo_departamento(String codigo_departamento) {
		this.codigo_departamento = codigo_departamento;
	}

	public String getNombre_departamento() {
		return nombre_departamento;
	}

	public void setNombre_departamento(String nombre_departamento) {
		this.nombre_departamento = nombre_departamento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public long getTlf_departamento() {
		return tlf_departamento;
	}

	public void setTlf_departamento(long tlf_departamento) {
		this.tlf_departamento = tlf_departamento;
	}
	
	
	
}
