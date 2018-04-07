package com.sa.dao;

import java.util.List;

import com.sa.domain.AjaxFormData;

public interface AjaxDao {
	public List<AjaxFormData> getCollege();
	
	public List<AjaxFormData> getMajor(String college);
	
	public List<AjaxFormData> getClasses(String major);
}
