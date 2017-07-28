package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="home")
public class HomeController {
	
	@RequestMapping(value="home1",method= RequestMethod.GET )
	public String home(){
		return "home";
	}
	
	@RequestMapping(value="home2")
	public String home2(){
		return "home2";
	}
}
