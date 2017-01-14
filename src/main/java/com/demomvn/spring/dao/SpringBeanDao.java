package com.demomvn.spring.dao;

import java.util.List;

import com.demomvn.spring.model.SpringBean;

public interface SpringBeanDao {

	List<SpringBean> getSpringBeanList();
	void save(SpringBean springBean);
	void delete(SpringBean springBean);
}
