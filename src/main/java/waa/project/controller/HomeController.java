package waa.project.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import waa.project.domain.TestProduct;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/","/welcome"}, method = RequestMethod.GET)
	public String homePage(Locale locale, Model model, HttpServletRequest request) {
		
		HttpSession session= request.getSession();
		session.removeAttribute("myCart");
		
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);		
		String formattedDate = dateFormat.format(date);		
		model.addAttribute("serverTime", formattedDate );
				
		return "welcome";
	}
	
	@RequestMapping(value = {"/productList"}, method = RequestMethod.GET)
	public String productList(Model model) {
		
		List<TestProduct>pList=new ArrayList<TestProduct>();
		
		pList.add(new TestProduct(1,"p1",20.0));
		pList.add(new TestProduct(2,"p2",10.0));
		pList.add(new TestProduct(3,"p3",60.0));
		model.addAttribute("pList", pList );
		System.out.println(pList);
		return "productList";
	}
	
}
