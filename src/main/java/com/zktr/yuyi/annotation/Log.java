package com.zktr.yuyi.annotation;


import java.lang.annotation.*;

/**
 * 自定义操作日志注解
 * @author suan
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    String value() default "";
        }