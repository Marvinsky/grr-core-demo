package com.demomvn.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TA_SPRING_BEAN")
public class SpringBean {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idSpringBean;
    
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaRegistro;

    public Integer getIdSpringBean() {
        return idSpringBean;
    }

    public void setIdSpringBean(Integer idSpringBean) {
        this.idSpringBean = idSpringBean;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
