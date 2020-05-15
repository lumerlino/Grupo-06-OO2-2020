package com.unla.Grupo06OO22020.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import com.unla.Grupo06OO22020.helpers.ViewRouteHelpers;

public class HomeController {
	

	@GetMapping("")
	public String index() {
		return ViewRouteHelpers.INDEX;
	}
}