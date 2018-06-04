package com.clustering.project.javaBean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class OrganizationBean {
	String ORGANIZATION_SEQ, NAME, TELEPHONE, ORDER_NUMBER, PARENT_ORGANIZATION_SEQ;
	
	public void setORGANIZATION_SEQ(String ORGANIZATION_SEQ) {
		this.ORGANIZATION_SEQ = ORGANIZATION_SEQ;
	}
	
	public String getORGANIZATION_SEQ() {
		return ORGANIZATION_SEQ;
	}
	
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}
	
	public String getNAME() {
		return NAME;
	}
	
	public void setTELEPHONE(String TELEPHONE) {
		this.TELEPHONE = TELEPHONE;
	}
	
	public String getTELEPHONE() {
		return TELEPHONE;
	}
	
	public void setORDER_NUMBER(String ORDER_NUMBER) {
		this.ORDER_NUMBER = ORDER_NUMBER;
	}
	
	public String getORDER_NUMBER() {
		return ORDER_NUMBER;
	}
	
	public void setPARENT_ORGANIZATION_SEQ(String PARENT_ORGANIZATION_SEQ) {
		this.PARENT_ORGANIZATION_SEQ = PARENT_ORGANIZATION_SEQ;
	}
	
	public String getPARENT_ORGANIZATION_SEQ() {
		return PARENT_ORGANIZATION_SEQ;
	}
	
	
	
	

}
