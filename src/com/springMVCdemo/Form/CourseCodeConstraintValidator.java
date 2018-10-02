package com.springMVCdemo.Form;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePerfix;
	
	public void initialize(CourseCode courseCode ){
		coursePerfix = courseCode.value();
	}
	@Override
	public boolean isValid(String str, ConstraintValidatorContext arg1) {

		boolean result;
		
		if(coursePerfix != null){
			result = str.startsWith(coursePerfix);
		}else{
			result = true;
		}
			
		return result;
	}

	
}
