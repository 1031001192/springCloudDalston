package com.consumer.Test;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * https://blog.csdn.net/yinni11/article/details/82019967
 *
 * https://zhuanlan.zhihu.com/p/213923786
 *
 * 下面是元注解：只能用来注解普通注解@Documented @Retention @Target @Inherited
 *
 * @Documented 生成到javadoc文档中
 *
 * 注解级别  可通过 @Retention 设置 ：SOURCE、CLASS、RUNTIME
 *
 * 修饰范围 可通过 @Target 来设置 只修饰 方法 或修饰类
 *
 * 注解继承 可通过@Inherited注解的注解 可以被继承(伪继承)
 * */

/**
 * 注解i相关方法
 *
 * 方法名	用法
 * Annotation getAnnotation(Class annotationType)	获取注解在其上的annotationType
 * Annotation[] getAnnotations()	获取所有注解
 * isAnnotationPresent(Class annotationType)	判断当前元素是否被annotationType注解
 * Annotation[] getDeclareAnnotations()	与getAnnotations() 类似，但是不包括父类中被Inherited修饰的注解
 * */

/**
 * 水果名称注解
 */
@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
