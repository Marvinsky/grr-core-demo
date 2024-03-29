package com.demomvn.spring.service;

import java.util.List;

import com.demomvn.dto.response.BeanResp;
import com.demomvn.spring.model.SpringBean;
import com.demomvn.spring.model.SpringBeanStpr;

public interface SpringBeanService {

	List<SpringBean> getSpringBeanList();
	List<SpringBeanStpr> getListSpringBeanStpr(int idSpringBean);
	void save(SpringBean springBean);
	void delete(SpringBean springBean);
	public BeanResp getBeanResp();
}
