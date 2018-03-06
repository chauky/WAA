package mum.edu.cs545.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs545.services.StadiumService;
import mum.edu.cs545.services.TeamService;


public class StadiumControlllers {
	@Resource
	StadiumService stadiumService;
	
	
	@RequestMapping(value="/stadiums", method=RequestMethod.GET)
	public String getAll(Model model) {
		model.addAttribute("stadiums", stadiumService.getAll());
		return "stadiumList";
	}
	
}
