package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



// there is @Component tag too which is used to tell the spring to create the beans for us so that we can inject when required
// spring will automatically initialize the class having @controller and register this class with the spring container
@Controller
public class FrontController {
	
	@ResponseBody
	@RequestMapping("/firstController")
	public String returnReply() {
		return "returning the msg from returnReply of FristController";
	}

}
