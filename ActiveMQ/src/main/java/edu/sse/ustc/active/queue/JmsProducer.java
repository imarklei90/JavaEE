package edu.sse.ustc.active.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author imarklei90
 * @since 2019.07.14
 */
public class JmsProducer {

	// ActiveMQ地址
	public static final String ACTIVEMQ_URL = "tcp://localhost:61616";
	public static final String QUEUE_NAME = "queue01";

	public static void main(String[] args) throws JMSException {

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

		// 创建消息生产者
		MessageProducer messageProducer = session.createProducer(queue);

		// 设置消息的持久化方式(默认是持久化的，但是只保证被发送一次和成功使用一次)
		messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

		// 通过使用消息生产者生产三条消息发送到MQ队列
		for (int i = 1; i <= 3; i++) {
			// 创建消息
			TextMessage message = session.createTextMessage("msg ->" + i);
			// 通过MessageProducer发送给mq
			messageProducer.send(message);

		}

		// 关闭资源
		messageProducer.close();
		session.close();
		connection.close();
	}
}
