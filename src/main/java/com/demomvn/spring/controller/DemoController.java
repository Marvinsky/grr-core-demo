package com.demomvn.spring.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demomvn.dto.request.BeanReq;
import com.demomvn.dto.response.BeanResp;
import com.demomvn.spring.service.SpringBeanService;

//@Controller(value="demoController")
@RestController
public class DemoController {

	@Resource
	SpringBeanService springBeanService;
	
	@RequestMapping(value = "/getBeans", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody ResponseEntity<BeanResp> getBeans(	@RequestBody BeanReq req,
															@RequestHeader("token") String token){
		
		
		System.out.println("=========================>getBeans");
        System.out.println(req.toString());
        
		BeanResp beanResp = springBeanService.getBeanResp(req);
		
		ResponseEntity<BeanResp> re = new ResponseEntity<BeanResp>(beanResp, HttpStatus.OK);
		
		return re;
	}
}
