package com.demo.spring.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.demo.spring.dao.SpringBeanDao;
import com.demo.spring.model.SpringBean;

@Repository
public class SpringBeanDaoImpl implements SpringBeanDao{

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public List<SpringBean> getSpringBeanList(){
		
		List<SpringBean> lstSpringBean = new ArrayList<SpringBean>();
		
		lstSpringBean = (List)hibernateTemplate.find("FROM SpringBean");
		
		return lstSpringBean;
	}
	
	public void save(SpringBean springBean){
		hibernateTemplate.save(springBean);
	}
	
	public void delete(SpringBean springBean){
		hibernateTemplate.delete(springBean);
	}
}
