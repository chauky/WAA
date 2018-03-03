package cs544.lab5;

import java.util.Locale;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="/books")
public class BookController {

	@Resource
	private IBookDao bookDao;
	
	@RequestMapping("/")
	public String redirectRoot(Locale locale, Model model) {
//		return "redirect:/books";
        Locale currentLocale = LocaleContextHolder.getLocale();
        model.addAttribute("locale", currentLocale);
		return "welcome";
	}
	
	@RequestMapping(value="/books", method=RequestMethod.GET)
	public String getAll(Model model) {
		model.addAttribute("books", bookDao.getAll());
		return "bookList";
	}
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public String add(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(!result.hasErrors()) {
			bookDao.add(book);
			return "redirect:/books";
		}else {
			return "addBook";
		}
	}
	
	@RequestMapping(value="/addBook", method=RequestMethod.GET)
    public String addBook(@ModelAttribute("book") Book book) {
	    return "addBook";
    }

	@RequestMapping(value="/books/{id}", method=RequestMethod.GET)
	public String get(@PathVariable int id, Model model) {
		model.addAttribute("book", bookDao.get(id));
		return "bookDetail";
	}
	
	@RequestMapping(value="/books/{id}", method=RequestMethod.POST)
	public String update(Book book, @PathVariable int id) {
		bookDao.update(id, book); // book.id already set by binding
		return "redirect:/books";
	}
	
	@RequestMapping(value="/books/delete", method=RequestMethod.POST)
	public String delete(int bookId) {
		bookDao.delete(bookId);
		return "redirect:/books";
	}


	@ExceptionHandler(value=NoSuchResourceException.class)
	public ModelAndView handle(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.getModel().put("e", e);
		mv.setViewName("noSuchResource");
		return mv;
	}
}
