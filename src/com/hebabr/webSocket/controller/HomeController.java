package com.hebabr.webSocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/server")
	public String server() throws Exception {
		return "server";
	}
	
	@RequestMapping("/client")
	public String client() throws Exception {
		return "client";
	}
	
}
