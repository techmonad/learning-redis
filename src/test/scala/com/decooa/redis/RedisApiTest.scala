package com.decooa.redis

import com.decooda.redis.RedisConnection
import com.techmonad.redis.{RedisApi, RedisConnection}
import org.scalatest.FunSuite

class RedisApiTest extends FunSuite {


  val redisApi = new RedisApi with RedisConnection

  test("save value ") {
    val response = redisApi.save("name", "bob")

    assert(response === "OK")
  }


  test("get value") {
    val response = redisApi.get("name")
    assert(response === "bob")
  }
}
