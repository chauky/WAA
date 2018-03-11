package edu.mum.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.mum.coffee.domain.Person;

import edu.mum.coffee.repository.PersonRepository;


@Controller
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonRepository personRepository;
	
	
	@RequestMapping(value = "/personList", method = RequestMethod.GET)
	public String getAllpersons(Model model) {
		model.addAttribute("persons", personRepository.findAll());
		return "personList";
	}

	@RequestMapping(value = "/personList/{id}", method = RequestMethod.GET)
	public String getpersonByID(Model model, @PathVariable("id") Long id) {
		model.addAttribute(personRepository.findOne(id));
		return "personDetail";
		
	}
	
	
	@RequestMapping(value = "/updatePerson", method = RequestMethod.POST)
	public String create(Model model, Person person) {
		model.addAttribute(personRepository.save(person));
		return "redirect:/persons/personList";
	}


	@RequestMapping("/delete/{id}")
	public String detete(@PathVariable("id") Long id) {
		personRepository.delete(id);
		return"personDetail";
	}
	
	
	
	@GetMapping("addPerson")
	public String addperson(Model model, Person person) {
		return "personDetail";
		
	}
	 
	@GetMapping("updateInfo")
	public String updateInfo(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String email = auth.getName();
	    Person person = personRepository.findByEmail(email).get(0);
	    model.addAttribute("person",person);
		return "personDetail";
	}
	
	//================================REST=====================================
	@GetMapping
	public Iterable<Person> getAllPersons(){
		return personRepository.findAll();
	}

	
	@GetMapping("/{id}")
	public Person getPersonByID(@PathVariable("id") long id){
		
		return personRepository.findOne(id);
	}
	
	@PostMapping
	public Person create(@RequestBody Person person) {
		return personRepository.save(person);
		
	}
	
	@PutMapping
	public Person update(@RequestBody Person person) {
		return personRepository.save(person);
	}

}
