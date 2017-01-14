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
import com.demomvn.spring.service.SpringBeanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath:spring-servlet-test.xml" })
public class SpringBeanServiceImplTest {

	@Resource(name="springBeanService")
	SpringBeanService springBeanService;
	
	@Test
    public void testGetSpringBeanList() {
		
		SpringBean springBean = new SpringBean();
		springBean.setDni("10000001");
        springBean.setNombre("demo");
        springBean.setApellido("spring");
        springBean.setFechaRegistro("26/08/2014");
        
        springBeanService.save(springBean);
		
		List<SpringBean> lst = springBeanService.getSpringBeanList();
        System.out.println("SpringBean:"+lst.size());
        
        BeanResp resp = springBeanService.getBeanResp();
        System.out.println("resp:"+resp.getBeans().size());
        
        springBeanService.delete(springBean);
        
        lst = springBeanService.getSpringBeanList();
        System.out.println("SpringBean:"+lst.size());
	}
}
