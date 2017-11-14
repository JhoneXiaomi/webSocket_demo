package com.hebabr.webSocket.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hebabr.base.dao.EntidadeDtoMapper;


@Service
public class WebSocketServiceImpl {

	@Autowired
	private EntidadeDtoMapper entidadeDtoMapper; 
	
	public void testeCrud() {
		
	}
}
