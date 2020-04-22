package com.dubbo.study.spi.impl;

import com.dubbo.study.spi.Robot;

public class Bumblebee implements Robot {

    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }
}
