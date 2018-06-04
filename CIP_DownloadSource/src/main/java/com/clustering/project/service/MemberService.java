package com.clustering.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clustering.project.repository.MemberDao;

/**
 * Handles requests for the application home page.
 */
@Service
public class MemberService {

	@Autowired
	private MemberDao dao;

	public Object getObject(Object dataMap) {

		Object resultObject = dao.getObject(dataMap);
		return resultObject;

	}

	public List<Object> getList(Object dataMap) {

		List<Object> resultList = dao.getList(dataMap);
		//resultObject = dao.getList(dataMap);

		return resultList;

	}
}