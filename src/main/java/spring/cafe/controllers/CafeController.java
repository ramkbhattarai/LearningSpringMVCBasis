package spring.cafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {
	
	
	@RequestMapping("/order")
	public String returnOrder(HttpServletRequest request,Model model) {
		
		String food = (String) request.getParameter("food");
		System.out.println(food);
		model.addAttribute("food",food );
		return "CafeViewResolver";
	}

	
	@RequestMapping("/cafe")
	public String returnWelcome(Model model) {
		String name = "Buba Ra Aama";
		model.addAttribute("name", name);
		return "WelcomeViewResolver";
	}
}
