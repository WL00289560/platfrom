package platfrom.socket;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import com.google.gson.Gson;

import platfrom.socket.domain.TalkMessage;



@ServerEndpoint("/tosocket/{id}/end")
public class HelloService {
	Map<String, Session> users = new HashMap<>();
	@OnOpen
	public void conneted(@PathParam("id")String userid,Session session) {
		users.put(userid, session);
		System.out.printf("使用者:%s上線了,Session:%s,線上人數還有:%s\n",userid,session.getId(),users.size());
	}
	@OnClose
	public void disconneted(@PathParam("id")String userid,Session session) {
		users.remove(userid);
		System.out.printf("使用者:%s離線了,Session:%s,線上人數還有:%s\n",userid,session.getId(),users.size());
	}
	@OnMessage
	public void totalk(@PathParam("id")String userid,String concent,Session session) {
		Gson gson = new Gson();
		TalkMessage tkm = gson.fromJson(concent, TalkMessage.class);
		for(String who : users.keySet()) {
			if(userid.equals(who)) {
			
				String msg = String.format("%s 對 %s 說:%s",tkm.getFrom(),tkm.getTo(),tkm.getMessage());
				System.out.println(msg);
				Session ses = users.get(who);
				try {
					ses.getBasicRemote().sendText(msg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			}
		}
		
	}
	
	
}