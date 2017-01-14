package com.demomvn.spring.service;

import java.util.List;

import com.demomvn.dto.response.BeanResp;
import com.demomvn.spring.model.SpringBean;

public interface SpringBeanService {

	List<SpringBean> getSpringBeanList();
	void save(SpringBean springBean);
	void delete(SpringBean springBean);
	public BeanResp getBeanResp();
}
