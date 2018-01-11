package org.leason.learn.jdkproxy;

/**
 * Created by lee on 2018/1/6.
 */
public class JdkInterfaceImpl implements JdkInterface {

    @Override
    public void doSomething() {
        System.out.println("I can do something");
    }

    @Override
    public void notDoSomething() {
        System.out.println("I can't do something");
    }
}
