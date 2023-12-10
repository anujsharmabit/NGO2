package com.ngo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ngo.entity.NGOPerson;
import com.ngo.entity.Payment;
import com.ngo.service.NGOService;

import jakarta.validation.Valid;

@Controller
public class NGOController {

	@Autowired
	private NGOService ngoService;

	public NGOController(NGOService ngoService) {
		super();
		this.ngoService = ngoService;
	}
	
	@GetMapping("/index")
	public String ngoWebsite(Model model) {
		
		return "index";
	}
	@GetMapping("/joinNgo")
	public String joinNGOForm(Model model) {
		model.addAttribute("ngoPerson", new NGOPerson());
		return "ngo";
	}
	
	@PostMapping("/index")
	public String savStudent(@Valid @ModelAttribute("ngoPerson") NGOPerson ngoPerson, BindingResult result,Model model) {
		if (result.hasErrors()) {
			System.out.println(result);
			return "ngo"; // 
		}
		String organisationEmail = ngoPerson.getOrganisationEmail();
		String organisationName = ngoPerson.getOrganisationName();
		NGOPerson ngoPersonByEmail = ngoService.findByorganisationEmail(organisationEmail);
		NGOPerson ngoPersonByName = ngoService.findByorganisationName(organisationName);

		if (ngoPersonByEmail == null && ngoPersonByName == null) {
		    // NGO with the given email and organization name does not exist, save and show success message
		    model.addAttribute("success", true);
		    ngoService.saveNGOPerson(ngoPerson);
		    return "index";
		} else {
		    // Check which field already exists and set the corresponding flags
		    if (ngoPersonByEmail != null) {
		        model.addAttribute("emailExists", true);
		    }
		    if (ngoPersonByName != null) {
		        model.addAttribute("organisationNameExists", true);
		    }
		    return "ngo";
		}

	
	}
}