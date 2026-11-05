package edu.altair.apicrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alumno")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_alumno")
	private int id_alumno;
	
	@Column(name="nombre_alumno", length=30, nullable=false)
	private String nombre_alumno;
	
	@Column(name="apellidos_alumno", length=100, nullable=false)
	private String apellidos_alumno;
	
	@Column(name="dni_alumno", length=9, nullable=false, unique=true)
	private String dni_alumno;
	
	@Column(name="numero_SS_alumno", length=11, unique=true)
	private String numero_SS_alumno;
	
	@Column(name="email_personal_alumno", length=200)
	private String email_personal_alumno;
	
	@Column(name="email_centro_alumno", length=200, unique=true)
	private String email_centro_alumno;
	
	@Column(name="tlf_personal_alumno", length=9, unique=true)
	private String tlf_personal_alumno;
	
	@Column(name="fecha_alta_alumno", length=10, nullable=false)
	private String fecha_alta_alumno;
	
	@Column(name="fecha_baja_alumno", length=10)
	private String fecha_baja_alumno;
	
	@Column(name="familia_alumno", length=50)
	private String familia_alumno;

	
	
	public Alumno() {
		super();
	}

	public int getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getNombre_alumno() {
		return nombre_alumno;
	}

	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}

	public String getApellidos_alumno() {
		return apellidos_alumno;
	}

	public void setApellidos_alumno(String apellidos_alumno) {
		this.apellidos_alumno = apellidos_alumno;
	}

	public String getDni_alumno() {
		return dni_alumno;
	}

	public void setDni_alumno(String dni_alumno) {
		this.dni_alumno = dni_alumno;
	}

	public String getNumero_SS_alumno() {
		return numero_SS_alumno;
	}

	public void setNumero_SS_alumno(String numero_SS_alumno) {
		this.numero_SS_alumno = numero_SS_alumno;
	}

	public String getEmail_personal_alumno() {
		return email_personal_alumno;
	}

	public void setEmail_personal_alumno(String email_personal_alumno) {
		this.email_personal_alumno = email_personal_alumno;
	}

	public String getEmail_centro_alumno() {
		return email_centro_alumno;
	}

	public void setEmail_centro_alumno(String email_centro_alumno) {
		this.email_centro_alumno = email_centro_alumno;
	}

	public String getTlf_personal_alumno() {
		return tlf_personal_alumno;
	}

	public void setTlf_personal_alumno(String tlf_personal_alumno) {
		this.tlf_personal_alumno = tlf_personal_alumno;
	}

	public String getFecha_alta_alumno() {
		return fecha_alta_alumno;
	}

	public void setFecha_alta_alumno(String fecha_alta_alumno) {
		this.fecha_alta_alumno = fecha_alta_alumno;
	}

	public String getFecha_baja_alumno() {
		return fecha_baja_alumno;
	}

	public void setFecha_baja_alumno(String fecha_baja_alumno) {
		this.fecha_baja_alumno = fecha_baja_alumno;
	}

	public String getFamilia_alumno() {
		return familia_alumno;
	}

	public void setFamilia_alumno(String familia_alumno) {
		this.familia_alumno = familia_alumno;
	}
	
	
}
