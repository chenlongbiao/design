package com.chen.design.SimpleFactoryPattern;

import com.chen.design.consts.NormalConstant;

/**
 * @author 陈龙飚
 * @version V1.0
 * @class: SimpleFactory
 * @date 2021/3/15
 * @project design
 * @description 简单工厂
 */
public class SimpleFactory {

    public SimpleFactory() {
    }

    public static IProduct makeProduct(Object kind){
        if (kind.equals(NormalConstant.SimpleFactory.KIND_A)){
            return new ProductA();
        }

        if (kind.equals(NormalConstant.SimpleFactory.KIND_B)){
            return new ProductB();
        }
        return null;
    }
}
