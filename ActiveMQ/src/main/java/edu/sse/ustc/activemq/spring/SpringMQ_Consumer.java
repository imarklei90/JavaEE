package edu.sse.ustc.activemq.spring;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/** Spring 整个ActiveMQ 消费者
 * @author imarklei90
 * @since 2019.07.16
 */
@Service
public class SpringMQ_Consumer {

	@Autowired
	private JmsTemplate jmsTemplate;

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		SpringMQ_Consumer consumer = (SpringMQ_Consumer) applicationContext.getBean("springMQ_Consumer");
		String receiveAndConvert = (String)consumer.jmsTemplate.receiveAndConvert();
		System.out.println("消费者收到的消息：" + receiveAndConvert);
	}
}
