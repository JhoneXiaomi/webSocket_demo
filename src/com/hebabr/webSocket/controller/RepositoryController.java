package com.hebabr.webSocket.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.hebabr.webSocket.service.impl.WebSocketServiceImpl;

@Controller
public class RepositoryController {
	
	@Autowired
	private WebSocketServiceImpl webSocketServiceImpl;

	@RequestMapping("/repository")
	public String conexaoEstabelecida() {
		webSocketServiceImpl.testeCrud();
		return "home";
	}

}