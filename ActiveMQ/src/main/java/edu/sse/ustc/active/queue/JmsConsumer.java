package edu.sse.ustc.active.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

/**
 * @author imarklei90
 * @since 2019.07.14
 */
public class JmsConsumer {
	// ActiveMQ地址
	public static final String ACTIVEMQ_URL = "tcp://localhost:61616";
	public static final String QUEUE_NAME = "queue01";

	public static void main(String[] args) throws JMSException, IOException {

		// 创建连接工厂
		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);

		// 通过连接工厂获取连接
		Connection connection = activeMQConnectionFactory.createConnection();

		// 启动访问
		connection.start();

		// 创建Session
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

		// 创建Destination
		Queue queue = session.createQueue(QUEUE_NAME);

		// 创建消费者
		MessageConsumer messageConsumer = session.createConsumer(queue);

		/*
			同步阻塞方式receive()
		while (true){
			TextMessage textMessage = (TextMessage) messageConsumer.receive();
			if(textMessage != null){
				System.out.println("消费者接受到消息：" + textMessage.getText());
			}else{
				System.out.println("没有消息需要处理");
				break;
			}
		}

		messageConsumer.close();
		session.close();
		connection.close();*/

		// 异步非阻塞方式：通过监听的方式监听消息
		messageConsumer.setMessageListener(new MessageListener() {
			@Override
			public void onMessage(Message message) {
				if(null != message && message instanceof TextMessage){
					TextMessage textMessage = (TextMessage)message;
					try {
						System.out.println("消费者消费消息:" + textMessage.getText());
					} catch (JMSException e) {
						e.printStackTrace();
					}
				}
			}
		});

		// 保证控制台不关闭
		System.in.read();

		messageConsumer.close();
		session.close();
		connection.close();

	}
}
