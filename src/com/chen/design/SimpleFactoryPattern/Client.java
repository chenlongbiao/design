package com.chen.design.SimpleFactoryPattern;

/**
 * @author 陈龙飚
 * @version V1.0
 * @class: Client
 * @date 2021/3/15
 * @project design
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory.makeProduct("B").doSomething();
    }
}
