package myproject.flower.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
	@GetMapping("/hello")
	String hello() {
		return "/backend/user-add";
	}
}
