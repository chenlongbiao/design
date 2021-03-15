package com.chen.design.SimpleFactoryPattern;

/**
 * @author 陈龙飚
 * @version V1.0
 * @class: ProductA
 * @date 2021/3/15
 * @project design
 * @description 具体产品 A
 */
public class ProductA implements IProduct {
    @Override
    public void doSomething() {
        System.out.println("A产品创建了");
    }
}
