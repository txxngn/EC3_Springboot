package ca.sheridancollege.ngquocth.EC3Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EC3Controller {
	
	@GetMapping ("/")
	public String root() {
		return "login.html";
	}
	
	@GetMapping ("/studentInfor")
	public String access(@RequestParam String username, @RequestParam String password ) {
		if (username.equals("Thai")&& password.equals("abc")){
			return "welcome.html";
		}
		else {
			return "error.html";}
		
	}
	
	

	@GetMapping ("/studentAdd")
	public String studentInfor(@RequestParam String name,
			@RequestParam int id, @RequestParam(required=false) String one,
			@RequestParam(required=false) String two,
			@RequestParam(required=false) String three,
			@RequestParam(required=false) String four,
			@RequestParam(required=false, defaultValue="false") boolean coop,
			@RequestParam(required=false, defaultValue="false") boolean fulltime,
			@RequestParam(required=false, defaultValue="false") boolean paid) {
		System.out.println("Name: "+name+" ,ID: "+id+" ,Courses: "+one+two+three+
				" ,Type: "+coop+fulltime+paid);
		
		return "welcome.html";
	}

	


}
