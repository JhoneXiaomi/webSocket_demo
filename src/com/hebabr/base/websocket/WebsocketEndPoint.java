package com.hebabr.base.websocket;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class WebsocketEndPoint extends TextWebSocketHandler {
	
	
	 @Override  
	    protected void handleTextMessage(WebSocketSession session,  
	            TextMessage message) throws Exception {  
	        super.handleTextMessage(session, message);  
//	        TextMessage returnMessage = new TextMessage(message.getPayload()+" received at server");
//	        System.out.println((returnMessage.toString()));
//	        session.sendMessage(returnMessage);  
	    }
	 
	 
	 // private static final ArrayList<WebSocketSession> users;//这个会出现性能问题，最好用Map来存储，key用userid
	 private static final Map<String, WebSocketSession> wsMap;
	 
	    static {
	    	wsMap = new HashMap<String, WebSocketSession>();
	    }
	    
	    public WebsocketEndPoint() {
	        // TODO Auto-generated constructor stub
	    }

	    /**
	     * 连接成功时候，会触发页面上onopen方法
	     */
	    public void afterConnectionEstablished(WebSocketSession session,TextMessage message) throws Exception {
	        // TODO Auto-generated method stub
	        System.out.println("connect to the websocket success......当前数量:"+wsMap.size());
	        System.out.println(message.getPayload());
	        wsMap.put("userId", session);
	        //这块会实现自己业务，比如，当用户登录后，会把离线消息推送给用户
	        //TextMessage returnMessage = new TextMessage("你将收到的离线");
	        //session.sendMessage(returnMessage);
	    }
	    
	    /**
	     * 关闭连接时触发
	     */
	    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
//	        String username= (String) session.getAttributes().get("WEBSOCKET_USERNAME");
//	        System.out.println("用户"+username+"已退出！");
//	        users.remove(session);
//	        System.out.println("剩余在线用户"+users.size());
	    }



	    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
//	        if(session.isOpen()){session.close();}
//	        users.remove(session);
	    }

	    public boolean supportsPartialMessages() {
	        return false;
	    }
	    
	    
	    /**
	     * 给某个用户发送消息
	     *
	     * @param userName
	     * @param message
	     */
	    public void sendMessageToUser(String userId, TextMessage message) {
//	        for (WebSocketSession user : users) {
//	            if (user.getAttributes().get("WEBSOCKET_USERNAME").equals(userName)) {
//	                try {
//	                    if (user.isOpen()) {
//	                        user.sendMessage(message);
//	                    }
//	                } catch (IOException e) {
//	                    e.printStackTrace();
//	                }
//	                break;
//	            }
//	        }
	    }
	    
	    /**
	     * 给所有在线用户发送消息
	     *
	     * @param message
	     */
	    public void sendMessageToUsers(TextMessage message) {
//	        for (WebSocketSession user : users) {
//	            try {
//	                if (user.isOpen()) {
//	                    user.sendMessage(message);
//	                }
//	            } catch (IOException e) {
//	                e.printStackTrace();
//	            }
//	        }
	    }

}
