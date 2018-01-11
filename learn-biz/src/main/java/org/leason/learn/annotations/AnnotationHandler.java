package org.leason.learn.annotations;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lee on 2018/1/3.
 */
public class AnnotationHandler {

    public static void main(String[] args) {
        Class annotationTestClass = AnnotationUser.class;
        for (Method method : annotationTestClass.getMethods()) {
            AnnotationObj annotation = method.getAnnotation(AnnotationObj.class);
            if (annotation != null) {
                System.out.println(method.getName());
                System.out.println(annotation.age());
                System.out.println(annotation.name());
                System.out.println(annotation.sex());
                Proxy.newProxyInstance(annotationTestClass.getClassLoader(), annotationTestClass.getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return null;
                    }
                });
            }
        }

    }
}
