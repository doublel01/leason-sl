package org.leason.learn.jdkproxy;

/**
 * Created by lee on 2018/1/6.
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        JdkProxyObj proxyObj = new JdkProxyObj();
        JdkInterface jdkInterface = (JdkInterface) proxyObj.bind(new JdkInterfaceImpl());
        jdkInterface.doSomething();
    }
}
