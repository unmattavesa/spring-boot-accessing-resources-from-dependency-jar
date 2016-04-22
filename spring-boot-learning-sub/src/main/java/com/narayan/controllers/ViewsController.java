package com.narayan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewsController {

	@RequestMapping(value = "/")
	public String defaultView() {
		return "default";
	}
	
	@RequestMapping(value = "/sample")
	public String sampleView() {
		return "sample";
	}
}
