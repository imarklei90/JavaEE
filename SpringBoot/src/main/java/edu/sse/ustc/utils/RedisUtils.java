package edu.sse.ustc.utils;

import redis.clients.jedis.HostAndPort;

import java.util.HashSet;
import java.util.Set;

/** Redis 工具类
 * @author imarklei90
 * @since 2019.06.19
 */
public class RedisUtils {

	/**
	 * 从SpringBoot配置文件中解析Redis集群信息
	 * @param clusterNodes
	 */
	public static Set<HostAndPort> getRedisClusterNodes(String clusterNodes) {
		// 获取集群节点信息
		String[] redisNodes = clusterNodes.split(",");

		// 创建Set集合存放集群节点信息
		Set<HostAndPort> redisNodeSets = new HashSet<>();

		// 循环节点信息
		for (String redisNode : redisNodes) {
			String[] redisHostAndPorts = redisNode.split(":");
			String redisNodeHost = redisHostAndPorts[0];
			String redisNodePort = redisHostAndPorts[1];
			redisNodeSets.add(new HostAndPort(redisNodeHost, Integer.parseInt(redisNodePort)));
		}

		return redisNodeSets;
	}
}
