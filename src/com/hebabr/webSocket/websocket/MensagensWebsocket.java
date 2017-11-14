package com.hebabr.webSocket.websocket;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/ws/mensagens")
public class MensagensWebsocket {
	
	public static Set<Session> SESSIONS = Collections.synchronizedSet(new HashSet<Session>());

	@OnOpen
	public void onOpen(Session session) {
		System.out.println("onOpen");
		SESSIONS.add(session);
	}
	
	@OnClose
	public void OnClose(Session session) {
		System.out.println("OnClose");
		SESSIONS.remove(session);
	}
	
	@OnError
	public void onError(Session session, Throwable throwable) {
		System.out.println("onError: " + throwable);
	}
	
	@OnMessage
	public String onMessage(String message) {
		System.out.println("Client: " + message);
		return message;
	}
	
	/**
	 * Envia uma mensagem para as sessões em aberto desse websocket.
	 */
	public static void sendMessage(String mensagem) throws Exception {
		for (Session session : SESSIONS) {
			session.getBasicRemote().sendText(mensagem);
		}
	}
	
}