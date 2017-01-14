package com.demomvn.spring.dao;

import java.util.List;

import com.demomvn.spring.model.SpringBean;
import com.demomvn.spring.model.SpringBeanStpr;

public interface SpringBeanDao {

	List<SpringBean> getSpringBeanList();
	List<SpringBeanStpr> getListSpringBeanStpr(int idSpringBean);
	void save(SpringBean springBean);
	void delete(SpringBean springBean);
}
