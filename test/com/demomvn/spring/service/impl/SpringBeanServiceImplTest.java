package com.demomvn.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demomvn.dto.response.BeanResp;
import com.demomvn.spring.model.SpringBean;
import com.demomvn.spring.model.SpringBeanStpr;
import com.demomvn.spring.service.SpringBeanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath:spring-servlet-test.xml" })
public class SpringBeanServiceImplTest {

	@Resource
	SpringBeanService springBeanService;
	
	@Test
    public void testGetSpringBeanList() {
		
		SpringBean springBean = new SpringBean();
		springBean.setDni("12345678");
        springBean.setNombre("nombreTest");
        springBean.setApellido("apellidoTest");
        springBean.setFechaRegistro("01/01/2017");
        
        springBeanService.save(springBean);
		
		List<SpringBean> lst = springBeanService.getSpringBeanList();
        System.out.println("SpringBean:"+lst.size());
        
        
        int id = lst.get(lst.size()-1).getIdSpringBean();
        List<SpringBeanStpr> lstStpr = springBeanService.getListSpringBeanStpr(id);
        System.out.println("SpringBeanStpr:["+lstStpr.get(0).getIdSpringBean()+"]["+lstStpr.get(0).getNombre()+"]");
        
        BeanResp resp = springBeanService.getBeanResp();
        System.out.println("resp:"+resp.getBeans().size());
        
        springBeanService.delete(springBean);
        
        lst = springBeanService.getSpringBeanList();
        System.out.println("SpringBean:"+lst.size());
	}
}
