package com.medinfi.employeefrontend.controllers;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.medinfi.employee.model.Employee;
import com.medinfi.employee.model.EmployeeEntity;
import com.medinfi.employeefrontend.service.EmployeeService;



@RestController

public class EmployeeController 
{
	@Autowired
	private EmployeeService eventService;
	
     @RequestMapping(value="/")
     public ModelAndView onlode() {
 		ModelAndView mv=null;
 		try {
 			mv = new ModelAndView("index");
 			mv.addObject("employee", new Employee());
 			List<Employee> employess=(List<Employee>)eventService.findAllEmployee();
 			if(employess.isEmpty())
 			{
 				mv.addObject("employies",employess);
 			}
 			mv.addObject("employies",employess);
 		   }
 			catch (Exception e) {
 				
			}
 		return mv;
     }
     
     @RequestMapping(value = "add", method = RequestMethod.POST)
 	public ModelAndView add(@ModelAttribute("employee") Employee employee, HttpServletRequest request) {
    	 ModelAndView mv=new ModelAndView("redirect:/");
    	 try {
 		     
 			eventService.create(employee);
 			return mv;
 		} catch (Exception e) {
 			
 			return mv;
 		}
 	}
     @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
 	public ModelAndView edit(@PathVariable("id") int id) 
     {
    	 ModelAndView mv=new ModelAndView("index");
 		mv.addObject("employee",eventService.find(id));
 		List<Employee> employess=(List<Employee>)eventService.findAllEmployee();
 		mv.addObject("employies", employess);
 		return mv;
 	}
     @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
 	public ModelAndView delete(@PathVariable("id") int id) {
    	 ModelAndView mv=new ModelAndView("redirect:/");
 		eventService.delete(eventService.find(id));
 		return mv;
 	}
     
}
