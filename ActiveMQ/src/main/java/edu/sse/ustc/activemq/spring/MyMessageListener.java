package edu.sse.ustc.activemq.spring;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/** 自定义监听器
 * @author imarklei90
 * @since 2019.07.16
 */
@Component
public class MyMessageListener implements MessageListener {
	@Override
	public void onMessage(Message message) {
		if(null != message && message instanceof TextMessage){
			TextMessage textMessage = (TextMessage)message;
			try {
				System.out.println(textMessage.getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}
}
