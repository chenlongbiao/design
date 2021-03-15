package com.chen.design.SimpleFactoryPattern;

/**
 * @author 陈龙飚
 * @version V1.0
 * @class: ProductB
 * @date 2021/3/15
 * @project design
 * @description 具体产品 B
 */
public class ProductB implements IProduct{
    @Override
    public void doSomething() {
        System.out.println("B产品创建了");
    }
}
