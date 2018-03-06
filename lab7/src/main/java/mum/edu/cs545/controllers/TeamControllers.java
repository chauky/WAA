package mum.edu.cs545.controllers;


import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import mum.edu.cs545.Team;
import mum.edu.cs545.services.TeamService;

@Controller
public class TeamControllers {
	
	@Resource
	TeamService teamService;
	
	@RequestMapping("/addTeam")
	public String redirectRoot(@ModelAttribute("addteam")Team addTeam) {
		return "addTeam";
	}
	
	@RequestMapping(value="/teams", method=RequestMethod.GET)
	public String getAll(Model model) {
		model.addAttribute("teams", teamService.getAll());
		return "teamList";
	}
	
	@RequestMapping(value="/teams", method=RequestMethod.POST)
	public String add(@Valid @ModelAttribute("team") Team team, BindingResult result) {
		if(!result.hasErrors()) {
			teamService.Save(team);
			return "redirect:/teams";
		}else {
			return "addTeam";
		}
	}
	

}
