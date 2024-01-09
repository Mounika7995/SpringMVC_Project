package com.feuji.Controller;


import javax.swing.text.html.FormSubmitEvent.MethodType;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.feuji.bean.FeujiSolutions;
import com.feuji.service.FeujiService;
import com.feuji.service.FeujiSubSolution;

@Controller
public class FeujiController {
	@Autowired
	FeujiSubSolution feujiSubSolution;
	
	private static Logger log= LoggerFactory.getLogger(FeujiController.class.getSimpleName());
	@RequestMapping(path="/company",method=RequestMethod.GET)
	public ModelAndView companyDetails() {
//		return new ModelAndView("company");
		return new ModelAndView("company","feuji",new FeujiSolutions());
	}
	
	
	@RequestMapping(path="/company1",method=RequestMethod.POST)
	public ModelAndView companyVerfication(@Valid @ModelAttribute(name="feuji")FeujiSolutions solutions,BindingResult bindingresult) {	
		log.info(solutions.toString());
		
//		System.out.println(solutions.toString());
//		feujiSubSolution.save(solutions);
//		return new ModelAndView("company","feuji",new FeujiSolutions());
		if(bindingresult.hasErrors()) {
			return new ModelAndView("company","feuji",solutions);
		}
		return new ModelAndView("successFull");
		
	}
	
	
	
}
