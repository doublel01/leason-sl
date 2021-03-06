package org.leason.learn.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lee on 2018/1/6.
 */
public class JdkProxyObj implements InvocationHandler {

    private Object target;


    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("start proxy");

        result = method.invoke(target, args);

        System.out.println("stop proxy");
        return result;
    }
}
