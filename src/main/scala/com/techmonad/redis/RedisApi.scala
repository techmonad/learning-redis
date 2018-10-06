package com.techmonad.redis

trait RedisApi {
  this: RedisConnection =>

  def save(key: String, value: String): String =
    jedis.set(key, value)


  def get(key: String): String =
    jedis.get(key)


}
