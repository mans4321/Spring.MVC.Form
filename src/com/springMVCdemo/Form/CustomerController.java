package com.springMVCdemo.Form;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@InitBinder()
	public void intiBinder(WebDataBinder webDataBinder){// fix the space issue
		StringTrimmerEditor trimEditor = new StringTrimmerEditor(true); 
		webDataBinder.registerCustomEditor(String.class, trimEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Customer theCustomer = new Customer();
		
		// add student object to the model
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()){
			return "customer-form"; 
		}
		// log the input data
		System.out.println("theStudent: " + theCustomer.getFirstName()
							+ " " + theCustomer.getLastName());
		
		return "customer-confirmation";
	}
}
