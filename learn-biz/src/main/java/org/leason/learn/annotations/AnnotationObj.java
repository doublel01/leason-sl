package org.leason.learn.annotations;

import java.lang.annotation.*;

/**
 * Created by lee on 2018/1/3.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AnnotationObj {
    int age();

    String name();

    String sex();
}
