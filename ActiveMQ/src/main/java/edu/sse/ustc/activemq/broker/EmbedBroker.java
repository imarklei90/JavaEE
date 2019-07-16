package edu.sse.ustc.activemq.broker;

import org.apache.activemq.broker.BrokerService;

/** Broker - 自定义Broker - ActiveMQ的服务器实例
 * @author imarklei90
 * @since 2019.07.16
 */
public class EmbedBroker {
	public static void main(String[] args) throws Exception {
		BrokerService brokerService = new BrokerService();
		brokerService.setUseJmx(true);
		brokerService.addConnector("tcp://localhost:61616");
		brokerService.start();
	}
}
