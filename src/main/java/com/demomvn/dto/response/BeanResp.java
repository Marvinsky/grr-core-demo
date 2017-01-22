package com.demomvn.dto.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.demomvn.spring.model.SpringBean;
import com.demomvn.spring.model.SpringBeanStpr;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class BeanResp implements Serializable{

private static final long serialVersionUID = 1L;
	
	private List<SpringBeanStpr> beans = new ArrayList<SpringBeanStpr>();

	public List<SpringBeanStpr> getBeans() {
		return beans;
	}

	public void setBeans(List<SpringBeanStpr> beans) {
		this.beans = beans;
	}
}
