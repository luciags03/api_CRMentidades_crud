package edu.altair.apicrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="familia")
public class Familia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_familia")
	private int id_familia;

	
	@Column(name="nombre_madre", length=30)
	private String nombre_madre;
	
	@Column(name="nombre_padre", length=30)
	private String nombre_padre;
	
	@Column(name="apellidos_madre", length=100)
	private String apellidos_madre;
	
	@Column(name="apellidos_padre", length=100)
	private String apellidos_padre;
	
	@Column(name="email_madre", length=100)
	private String email_madre;
	
	@Column(name="email_padre", length=100)
	private String email_padre;
	
	@Column(name="tlf_madre", length=9)
	private long tlf_madre;
	
	@Column(name="tlf_padre", length=9)
	private long tlf_padre;
	
	@Column(name="direccion_madre", length=100)
	private String direccion_madre;
	
	@Column(name="direccion_padre", length=100)
	private String direccion_padre;
	
	@Column(name="CP_madre", length=5)
	private long CP_madre;
	
	@Column(name="CP_padre", length=5)
	private long CP_padre;
	
	@Column(name="municipio_madre", length=20)
	private String municipio_madre;
	
	@Column(name="municipio_padre", length=20)
	private String municipio_padre;
	
	@Column(name="provincia_madre", length=20)
	private String provincia_madre;
	
	@Column(name="provincia_padre", length=20)
	private String provincia_padre;
	
	@Column(name="son_separados")
	private boolean son_separados;
	
	@Column(name="es_compartida")
	private boolean es_compartida;
	
	@Column(name="es_padre")
	private boolean es_padre;
	
	@Column(name="es_madre")
	private boolean es_madre;

	
	
	public Familia() {
		super();
	}



	public int getId_familia() {
		return id_familia;
	}



	public void setId_familia(int id_familia) {
		this.id_familia = id_familia;
	}



	public String getNombre_madre() {
		return nombre_madre;
	}



	public void setNombre_madre(String nombre_madre) {
		this.nombre_madre = nombre_madre;
	}



	public String getNombre_padre() {
		return nombre_padre;
	}



	public void setNombre_padre(String nombre_padre) {
		this.nombre_padre = nombre_padre;
	}



	public String getApellidos_madre() {
		return apellidos_madre;
	}



	public void setApellidos_madre(String apellidos_madre) {
		this.apellidos_madre = apellidos_madre;
	}



	public String getApellidos_padre() {
		return apellidos_padre;
	}



	public void setApellidos_padre(String apellidos_padre) {
		this.apellidos_padre = apellidos_padre;
	}



	public String getEmail_madre() {
		return email_madre;
	}



	public void setEmail_madre(String email_madre) {
		this.email_madre = email_madre;
	}



	public String getEmail_padre() {
		return email_padre;
	}



	public void setEmail_padre(String email_padre) {
		this.email_padre = email_padre;
	}



	public long getTlf_madre() {
		return tlf_madre;
	}



	public void setTlf_madre(long tlf_madre) {
		this.tlf_madre = tlf_madre;
	}



	public long getTlf_padre() {
		return tlf_padre;
	}



	public void setTlf_padre(long tlf_padre) {
		this.tlf_padre = tlf_padre;
	}



	public String getDireccion_madre() {
		return direccion_madre;
	}



	public void setDireccion_madre(String direccion_madre) {
		this.direccion_madre = direccion_madre;
	}



	public String getDireccion_padre() {
		return direccion_padre;
	}



	public void setDireccion_padre(String direccion_padre) {
		this.direccion_padre = direccion_padre;
	}



	public long getCP_madre() {
		return CP_madre;
	}



	public void setCP_madre(long cP_madre) {
		CP_madre = cP_madre;
	}



	public long getCP_padre() {
		return CP_padre;
	}



	public void setCP_padre(long cP_padre) {
		CP_padre = cP_padre;
	}



	public String getMunicipio_madre() {
		return municipio_madre;
	}



	public void setMunicipio_madre(String municipio_madre) {
		this.municipio_madre = municipio_madre;
	}



	public String getMunicipio_padre() {
		return municipio_padre;
	}



	public void setMunicipio_padre(String municipio_padre) {
		this.municipio_padre = municipio_padre;
	}



	public String getProvincia_madre() {
		return provincia_madre;
	}



	public void setProvincia_madre(String provincia_madre) {
		this.provincia_madre = provincia_madre;
	}



	public String getProvincia_padre() {
		return provincia_padre;
	}



	public void setProvincia_padre(String provincia_padre) {
		this.provincia_padre = provincia_padre;
	}



	public boolean isSon_separados() {
		return son_separados;
	}



	public void setSon_separados(boolean son_separados) {
		this.son_separados = son_separados;
	}



	public boolean isEs_compartida() {
		return es_compartida;
	}



	public void setEs_compartida(boolean es_compartida) {
		this.es_compartida = es_compartida;
	}



	public boolean isEs_padre() {
		return es_padre;
	}



	public void setEs_padre(boolean es_padre) {
		this.es_padre = es_padre;
	}



	public boolean isEs_madre() {
		return es_madre;
	}



	public void setEs_madre(boolean es_madre) {
		this.es_madre = es_madre;
	}
	
	
	
}
