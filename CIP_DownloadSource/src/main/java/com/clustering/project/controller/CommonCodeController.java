package com.clustering.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonCodeController {
	@RequestMapping(value = "commonCode/{action}", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView edit(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView) {
		String viewName = "/commonCode/";
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Object> resultList = new ArrayList<Object>();

		if ("read".equalsIgnoreCase(action)) {
			viewName = viewName + action;
			resultMap = paramMap;
		} else if ("edit".equalsIgnoreCase(action)) {
			viewName = viewName + action;
			resultMap = paramMap;
		} else if ("list".equalsIgnoreCase(action)) {
			viewName = viewName + action;
			Map<String, Object> data01 = new HashMap<String, Object>();
			Map<String, Object> data02 = new HashMap<String, Object>();
			Map<String, Object> data03 = new HashMap<String, Object>();
			data01.put("NAME", "name 01");
			data01.put("COMMON_CODE_ID", "490293232849");
			data01.put("DESCRIPTION", "anything DESCRIPTION 01");
			data02.put("NAME", "name 02");
			data02.put("COMMON_CODE_ID", "490293232849");
			data02.put("DESCRIPTION", "anything DESCRIPTION 02");
			data03.put("NAME", "name 03");
			data03.put("COMMON_CODE_ID", "490293232849");
			data03.put("DESCRIPTION", "anything DESCRIPTION 03");
			resultList.add(data01);
			resultList.add(data02);
			resultList.add(data03);

		} else {
			viewName = viewName + "list";
		}
		modelandView.setViewName(viewName);
		modelandView.addObject("resultMap", resultMap);
		modelandView.addObject("resultList", resultList);
		return modelandView;
	}

}
