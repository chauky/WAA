package edu.mum.coffee.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mum.coffee.domain.Order;
import edu.mum.coffee.domain.Orderline;
import edu.mum.coffee.domain.Person;
import edu.mum.coffee.domain.Product;
import edu.mum.coffee.repository.OrderRepository;
import edu.mum.coffee.repository.PersonRepository;
import edu.mum.coffee.repository.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	OrderRepository orderRepository;

	@RequestMapping(value = "/productList", method = RequestMethod.GET)
	public String getAllProducts(Model model) {
		model.addAttribute("products", productRepository.findAll());
		return "productList";
	}

	@RequestMapping(value = "/productList/{id}", method = RequestMethod.GET)
	public String getProductByID(Model model, @PathVariable("id") int id) {
		model.addAttribute(productRepository.findOne(id));
		return "productDetail";
		
	}
	

	@RequestMapping(value = "/order/{pid}/{uid}", method = RequestMethod.GET)
	public String orderProduct(Model model, @PathVariable("pid") int pid,@PathVariable("uid") long uid, @RequestParam("quantity") int quantity) {
		Order order  = new Order();
		Person p = personRepository.getOne(uid);
		order.setPerson(p);
		order.setOrderDate(new Date());
		Orderline orderLine = new Orderline();
		Product product = productRepository.getOne(pid);
		orderLine.setProduct(product);
		orderLine.setQuantity(quantity);
		order.addOrderLine(orderLine);
		orderRepository.save(order);
		return "redirect:/orders/orderList";
		
	}
	
	
	@RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
	public String create(Model model, Product product) {
		model.addAttribute(productRepository.save(product));
		return "redirect:/products/productList";
	}


	@RequestMapping("/delete/{id}")
	public String detete(@PathVariable("id") int id) {
		try {
			productRepository.delete(id);
		}catch (Exception e) {
			System.out.println("Cannot delete product");
		}
		return"productDetail";
	}
	
	@GetMapping("addProduct")
	public String addProduct(Model model, Product product) {
		return "productDetail";
		
	}
	
	
	// ===========================================REST====================================
	
	@GetMapping
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		return productRepository.save(product);

	}
	
	@PutMapping
	public Product update(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@GetMapping("/{id}")
	public Product getProductByID(@PathVariable("id") int id) {
		return productRepository.findOne(id);
	}
	

}
