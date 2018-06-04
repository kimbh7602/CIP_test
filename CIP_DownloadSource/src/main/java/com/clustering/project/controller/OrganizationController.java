package com.clustering.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.clustering.project.javaBean.OrganizationBean;

@Controller
public class OrganizationController {
	@RequestMapping(value = "/organization/edit", method = {RequestMethod.GET, RequestMethod.POST} )
	public void edit() {}
	
	@RequestMapping(value = "/organization/list", method = {RequestMethod.GET, RequestMethod.POST})
	public void list() {}
	
	@RequestMapping(value = "/organization/read" , method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView read(OrganizationBean paramMap, ModelAndView modelandView){
		String viewName = "/organization/read";
		
		modelandView.setViewName(viewName);
		modelandView.addObject("paramMap",paramMap);
		
		return modelandView;
		
	}
	
	
}
