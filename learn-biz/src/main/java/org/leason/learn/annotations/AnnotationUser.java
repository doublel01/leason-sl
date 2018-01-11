package org.leason.learn.annotations;

/**
 * Created by lee on 2018/1/3.
 */
public class AnnotationUser {

    @AnnotationObj(name = "lee", age = 30, sex = "man")
    public void annotationMethod() {
        System.out.println("I am method that used to annotation");
    }
}
