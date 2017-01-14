package com.demo.spring.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.dao.SpringBeanDao;
import com.demo.spring.model.SpringBean;
import com.demo.spring.service.SpringBeanService;

//@Transactional(readOnly = false)
@Service
public class SpringBeanServiceImpl implements SpringBeanService{

	@Autowired
    SpringBeanDao springBeanDao;
	
	public List<SpringBean> getSpringBeanList(){
        return springBeanDao.getSpringBeanList();
    }
	
	public void save(SpringBean springBean){
		springBeanDao.save(springBean);
	}
	
	public void delete(SpringBean springBean){
		springBeanDao.delete(springBean);
	}
}
