package com.clustering.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.clustering.project.repository.MemberDao;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/member")
public class MemberController {

	@Autowired
	private MemberDao service;

	@RequestMapping(value = "/{action}")
	public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelAndView) {
		String viewName = "/member/";
		List<Object> resultList = new ArrayList<Object>();
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if ("read".equalsIgnoreCase(action)) {
			viewName = viewName + action;
			resultMap = (Map<String, Object>) service.getObject(paramMap);
		} else if ("edit".equalsIgnoreCase(action)) {
			viewName = viewName + action;
		} else if ("list".equalsIgnoreCase(action)) {
			viewName = viewName + action;
			resultList = service.getList(paramMap);
		} else {
			viewName = viewName + "list";
		}
		modelAndView.setViewName(viewName);
		modelAndView.addObject("resultMap", resultMap);
		modelAndView.addObject("resultList", resultList);

		return modelAndView;

	}
}