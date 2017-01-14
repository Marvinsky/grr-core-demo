package com.demomvn.spring.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.demomvn.spring.dao.SpringBeanDao;
import com.demomvn.spring.model.SpringBean;
import com.demomvn.spring.model.SpringBeanStpr;

@Repository
public class SpringBeanDaoImpl implements SpringBeanDao{

	@Resource
	HibernateTemplate hibernateTemplate;
	
	public List<SpringBean> getSpringBeanList(){
		
		List<SpringBean> lstSpringBean = new ArrayList<SpringBean>();
		
		lstSpringBean = (List)hibernateTemplate.find("FROM SpringBean");
		
		return lstSpringBean;
	}
	
	public List<SpringBeanStpr> getListSpringBeanStpr(final int idSpringBean){
        List<SpringBeanStpr> lst_springBeanSpr = new ArrayList<SpringBeanStpr>();
        
        lst_springBeanSpr = (List)hibernateTemplate.findByNamedQuery("getListSpringBean", idSpringBean);
        
        return lst_springBeanSpr;
    }
	
	public void save(SpringBean springBean){
		hibernateTemplate.save(springBean);
	}
	
	public void delete(SpringBean springBean){
		hibernateTemplate.delete(springBean);
	}
}
