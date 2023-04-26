package com.quanhui.huilai.service;

import org.junit.jupiter.api.Test;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;

@SpringBootTest
public class RedissonTest {
    @Resource
    private RedissonClient redissonClient;

    @Test
    void test(){
        //List。数据存在本地JVM内存中
        ArrayList<Object> list = new ArrayList<>();

        list.add("yupi");

        System.out.println("list: "+list.get(0));
//        list.remove(0);

        //数据存在redis的内存中
        RList<Object> rList = redissonClient.getList("test-list");
        rList.add("yupi");
        System.out.println("rList: "+rList.get(0));

//        rList.remove(0);
    }

}