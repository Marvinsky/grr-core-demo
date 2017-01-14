package com.demo.spring.service;

import java.util.List;

import com.demo.spring.model.SpringBean;

public interface SpringBeanService {

	List<SpringBean> getSpringBeanList();
	void save(SpringBean springBean);
	void delete(SpringBean springBean);
}
