package com.hebabr.webSocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hebabr.webSocket.websocket.MensagensWebsocket;



@Controller
public class MensagensController {
	
	@RequestMapping("/envia")
	public String cadastra(String mensagem) throws Exception {
		MensagensWebsocket.sendMessage(mensagem);
		return "server";
	}

}
