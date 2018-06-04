package com.clustering.project.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * Handles requests for the application home page.
 */
@Repository
public class MemberDao {

	public Object getObject(Object dataMap) {

		Map<String, Object> resultObject = new HashMap<String, Object>();

		resultObject.put("MEMBER_ID", "293029301202");
		resultObject.put("NAME", "Jinwoo 01");

		return resultObject;

	}
	
	public List<Object> getList(Object dataMap) {

		List<Object> resultList = new ArrayList<Object>();

		Map<String, Object> data01 = new HashMap<String, Object>();
		Map<String, Object> data02 = new HashMap<String, Object>();
		Map<String, Object> data03 = new HashMap<String, Object>();

		data01.put("MEMBER_ID", "293029301202");
		data01.put("NAME", "name 01");
		data02.put("MEMBER_ID", "74974549");
		data02.put("NAME", "name 02");
		data03.put("MEMBER_ID", "765127197121202");
		data03.put("NAME", "jinwoo 03");

		resultList.add(data01);
		resultList.add(data02);
		resultList.add(data03);

		return resultList;

	}

}

// bypass가 뭔지