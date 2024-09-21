package com.cobin.dp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * LogRemark
 * @author bingodfok
 * @date 2024/9/21 上午11:01
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface LogRemark {

    boolean ignoreEmpty() default true;

    String emptyDefault() default "";

}
