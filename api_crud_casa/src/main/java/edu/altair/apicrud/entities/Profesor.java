package edu.altair.apicrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesor")
public class Profesor {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que el ID se genera automáticamente. Tú no tienes que introducirlo cuando creas un profesor
	    @Column(name = "profesor_id")
	    private Long idProfesor;
	 
	 @Column(name = "nombre", nullable = false, length = 30)
	    private String nombre;
	 @Column(name = "apellidos", nullable = false, length = 100)
	    private String apellidos;

	    @Column(name = "DNI", nullable = false, unique = true, length = 9)
	    private String dni;
	    
	    @Column(name = "emailCentro", nullable = true, length = 100)
	    private String emailCentro;
	    
	    @Column(name = "emailPersonal", nullable = true, length = 300)
	    private String emailPersonal;
	   
	    @Column(name = "tlfPersonal", nullable = true, length = 300)
	    private String tlfPersonal;
	    
	  

		
    public Profesor() {
		super();
	}
    
    

	public Profesor(Long idProfesor, String nombre, String apellidos, String dni, String emailCentro,
			String emailPersonal, String tlfPersonal) {
		super();
		this.idProfesor = idProfesor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.emailCentro = emailCentro;
		this.emailPersonal = emailPersonal;
		this.tlfPersonal = tlfPersonal;
	}



	public Long getidProfesor() {
		return idProfesor;
	}

	public void setidProfesor(Long profesorId) {
		this.idProfesor = profesorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getdni() {
		return dni;
	}

	public void setdni(String dni) {
		this.dni = dni;
	}

	public String getEmailCentro() {
		return emailCentro;
	}

	public void setEmailCentro(String emailCentro) {
		this.emailCentro = emailCentro;
	}

	public String getEmailPersonal() {
		return emailPersonal;
	}

	public void setEmailPersonal(String emailPersonal) {
		this.emailPersonal = emailPersonal;
	}

	public String getTlfPersonal() {
		return tlfPersonal;
	}

	public void setTlfPersonal(String tlfPersonal) {
		this.tlfPersonal = tlfPersonal;
	}

    
    

   
}

