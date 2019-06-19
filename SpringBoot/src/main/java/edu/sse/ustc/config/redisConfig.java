package edu.sse.ustc.config;

import edu.sse.ustc.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.Set;

/** Redis Config
 * @author imarklei90
 * @since 2019.06.19
 */
@Configuration // applicationCpntext.xml
public class redisConfig {

	// 注入集群节点信息
	@Value("${spring.redis.cluster.nodes}")
	private String clusterNodes;

	@Bean // <bean>
	public JedisCluster getJedisCluster(){
		// 获取Redis集群节点信息
		Set<HostAndPort> redisHostAndPorts = RedisUtils.getRedisClusterNodes(clusterNodes);

		// 创建redis集群对象
		JedisCluster jedisCluster = new JedisCluster(redisHostAndPorts);
		return jedisCluster;
	}




}
