package com.demomvn.spring.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demomvn.dto.request.BeanReq;
import com.demomvn.dto.response.BeanResp;
import com.demomvn.spring.dao.SpringBeanDao;
import com.demomvn.spring.model.SpringBean;
import com.demomvn.spring.model.SpringBeanStpr;
import com.demomvn.spring.service.SpringBeanService;

@Transactional(readOnly = false)
//@Service(value="springBeanService")
public class SpringBeanServiceImpl implements SpringBeanService{

	@Resource
    SpringBeanDao springBeanDao;
	
	public List<SpringBean> getSpringBeanList(){
        return springBeanDao.getSpringBeanList();
    }
	
	public List<SpringBeanStpr> getListSpringBeanStpr(final BeanReq req){
		return springBeanDao.getListSpringBeanStpr(req);
	}
	
	public void save(SpringBean springBean){
		springBeanDao.save(springBean);
	}
	
	public void delete(SpringBean springBean){
		springBeanDao.delete(springBean);
	}
	
	public BeanResp getBeanResp(final BeanReq req){
		
		BeanResp beanResp = new BeanResp();
		beanResp.setBeans(springBeanDao.getListSpringBeanStpr(req));
		
        return beanResp;
    }
}
