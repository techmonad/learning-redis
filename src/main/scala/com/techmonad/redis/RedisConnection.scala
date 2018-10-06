package com.techmonad.redis

import redis.clients.jedis.Jedis

trait RedisConnection {

  val jedis: Jedis = RedisDB.jedis

}

private[redis] object RedisDB {
  val jedis: Jedis = new Jedis("localhost")


  //TODO: use  cluster for production
  /*
  val jedisClusterNodes =  new util.HashSet[HostAndPort]()
    jedisClusterNodes.add(new HostAndPort("127.0.0.1", 6379))
    val jedis: JedisCluster = new JedisCluster(jedisClusterNodes)
    */


}

