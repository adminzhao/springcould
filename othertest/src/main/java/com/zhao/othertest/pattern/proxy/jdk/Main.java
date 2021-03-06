package com.zhao.othertest.pattern.proxy.jdk;

public class Main {

    public static void main(String[] args) {
        //保存生成的代理类
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Subject subject = new RealSubject();

        JDKDynamicProxy proxy = new JDKDynamicProxy(subject);

        Subject proxy2 = proxy.getProxy(Subject.class);

        proxy2.doSomething();

    }
}
