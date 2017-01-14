package com.demo.spring.dao;

import java.util.List;

import com.demo.spring.model.SpringBean;

public interface SpringBeanDao {

	List<SpringBean> getSpringBeanList();
	void save(SpringBean springBean);
	void delete(SpringBean springBean);
}
