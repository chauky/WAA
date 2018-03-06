package mum.edu.cs545.controllers;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mum.edu.cs545.Team;
import mum.edu.cs545.services.TeamService;

@Controller
public class TeamControllers {
	
	@Resource
	TeamService teamService;
	
	@RequestMapping("/")
	public String redirectRoot(@ModelAttribute("addteam")Team addTeam) {
		return "addTeam";
	}
	
	@RequestMapping(value="/teams", method=RequestMethod.GET)
	public String getAll(Model model) {
		model.addAttribute("teams", teamService.getAll());
		return "teamList";
	}
	

}
