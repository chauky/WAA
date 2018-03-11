package edu.mum.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.mum.coffee.domain.Order;
import edu.mum.coffee.domain.Product;
import edu.mum.coffee.repository.OrderRepository;
import edu.mum.coffee.repository.ProductRepository;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	OrderRepository orderRepository;
	ProductRepository productRepository;

	@RequestMapping(value = "/orderList", method = RequestMethod.GET)
	public String getAllpersons(Model model) {
		model.addAttribute("orders", orderRepository.findAll());
		return "orderList";
	}

	@RequestMapping(value = "/orderList/{id}", method = RequestMethod.GET)
	public String getpersonByID(Model model, @PathVariable("id") int id) {
		model.addAttribute(orderRepository.findOne(id));
		return "orderDetail";
	}
	
	
	@RequestMapping(value = "/order/{pid}", method = RequestMethod.GET)
	public String addOder(Model model, @PathVariable("pid") int pid) {
		Product product = productRepository.findOne(pid);
		
		
		model.addAttribute(orderRepository.findOne(pid));
		return "orderDetail";
	}
	
	
	
	
	//========================================REST=====================================
	@GetMapping
	public Iterable<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@GetMapping("/{id}")
	public Order getOrderByID(@PathVariable("id") int id) {
		return orderRepository.findOne(id);
	}

	@PostMapping
	public Order create(@RequestBody Order order) {
		return orderRepository.save(order);

	}
}
