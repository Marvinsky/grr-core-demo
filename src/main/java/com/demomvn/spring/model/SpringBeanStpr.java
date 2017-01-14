package com.demomvn.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@NamedNativeQuery(
        name = "getListSpringBean",
        query = "{call db_demo.SP_SPRING_LIST(?)}",
        resultClass = SpringBeanStpr.class
        //,hints = {@QueryHint(name = "org.hibernate.callable", value = "true")}
    )
@Entity
public class SpringBeanStpr {

	@Id
    private Integer idSpringBean;
    
    private String nombre;

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
}
