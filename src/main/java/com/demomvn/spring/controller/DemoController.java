package com.demomvn.spring.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demomvn.dto.response.BeanResp;
import com.demomvn.spring.service.SpringBeanService;

//@Controller(value="demoController")
@RestController
public class DemoController {

	@Resource
	SpringBeanService springBeanService;
	
	@RequestMapping(value = "/getSpringBeans", method = RequestMethod.GET, headers = "Accept=application/json")  
    public String getSpringBeans(Model model) { 
		System.out.println("======> ENTROOO");
		System.out.println("======>"+springBeanService.getSpringBeanList().size());
		return "beans";
	}
	
	@RequestMapping(value = "/getBeans", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody ResponseEntity<BeanResp> getBeans(@RequestHeader("token") String token){
		
		BeanResp beanResp = springBeanService.getBeanResp();
		
		ResponseEntity<BeanResp> re = new ResponseEntity<BeanResp>(beanResp, HttpStatus.OK);
		
		return re;
	}
}
