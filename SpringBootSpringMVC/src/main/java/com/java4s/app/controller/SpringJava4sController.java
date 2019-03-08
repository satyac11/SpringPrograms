/* 
 * Author ::. Sivateja Kandula | www.java4s.com 
 *
 */

package com.java4s.app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SpringJava4sController {
	
	@GetMapping("/hello")
	public ModelAndView showLoginPage(Model model) {
        model.addAttribute("message", "Welcome to Java4s Spring Boot Tutorials");
        
        return new ModelAndView("welcomePage");
    }
}

// URL: http://localhost:8080/springbootmvc/