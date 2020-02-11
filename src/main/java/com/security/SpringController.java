package com.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringController {



		@RequestMapping(value="/")
	    public String visitHomePage() {
	        return "index";
	    }

	    @RequestMapping(value="/admin")
	    public String visitAdminPage() {       
	    return "admin";
	    }
	}