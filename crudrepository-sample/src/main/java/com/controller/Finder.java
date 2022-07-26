package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Finder {

	
	@RequestMapping("index")
    public String m1()
	{
		//System.out.println("Starting Page ");
		return "index";
	}
}
