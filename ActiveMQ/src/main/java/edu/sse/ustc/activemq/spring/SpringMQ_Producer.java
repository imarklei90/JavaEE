package edu.sse.ustc.activemq.spring;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Spring 整合ActiveMQ的生产者
 *
 * @author imarklei90
 * @since 2019.07.16
 */
@Service
public class SpringMQ_Producer {

	@Autowired
	private JmsTemplate jmsTemplate;

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringMQ_Producer producer = (SpringMQ_Producer)applicationContext.getBean("springMQ_Producer");
		producer.jmsTemplate.send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {

				return session.createTextMessage("spring与ActiveMQ的整合");
			}
		});

		/*producer.jmsTemplate.send((session) -> {
			TextMessage textMessage = session.createTextMessage("Springy与ActiveMQ的整合");
			return textMessage;
		});*/


	}
}
