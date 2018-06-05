package com.zhngye.test;

import java.util.HashMap;

import org.junit.Test;

public class TestHashMapCompare {
	@Test
	public void fun(){
		HashMap<Integer, User> hashMap = new HashMap<>();
		hashMap.put(18, new User(18, "zhangsan"));
		hashMap.put(1, new User(12, "lisi"));
		hashMap.put(26,new User(26,"wangwu"));
		System.err.println(hashMap);
	}
}

