package com.github.horai.core.spi;

import java.lang.annotation.*;

/**
 * Created by yWX377796 on 2016/12/5.
 * 注解，用于对象的反射。
 */
@Target(ElementType.TYPE)//程序元素类型。此枚举类型的常量提供了 Java 程序中声明的元素的简单分类。
@Retention(RetentionPolicy.RUNTIME)// 注解的注释，元注解，RetentionPolicy是定义注解的生命周期
@Documented//指示某一类型的注释将通过 javadoc 和类似的默认工具进行文档化
//这些常量与 Target 元注释类型一起使用，以指定在什么情况下使用注释类型是合法的。
public @interface SPI {

    /**
     *
     * @return
     */
    String key() default "";

    String defValue() default "";
}
