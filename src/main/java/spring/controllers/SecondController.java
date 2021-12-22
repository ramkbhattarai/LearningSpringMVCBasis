package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecondController {
	
	@ResponseBody
	@RequestMapping("/secondController")
	public String returnSecondController() {
		return "returning from returnSecondController from SecondController";
	}

}
