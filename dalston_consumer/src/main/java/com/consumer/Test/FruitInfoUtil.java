package com.consumer.Test;
import java.lang.reflect.Field;
/**
 * @Description: 注解处理器
 * @Title: FruitInfoUtil
 * @Package com.consumer.Test
 * @Author: LiBing
 * @Copyright 版权归个人所有
 * @CreateTime: 2022/4/29 17:57
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz){

        String strFruitName=" 水果名称：";
        String strFruitColor=" 水果颜色：";
        String strFruitProvicer="供应商信息：";

        //获得该类 所有字段，包括私有字段，getFields()是获取public字段
        Field[] fields = clazz.getDeclaredFields();

        //循环该类 所有字段
        for(Field field :fields){
            //判断指定注解 是否在此字段上
            //水果名称
            if(field.isAnnotationPresent(FruitName.class)){
                //如果是该类注解，获取注解 取得 改字段的值
                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
                strFruitName=strFruitName+fruitName.value();
                System.out.println(strFruitName);
            }
            //水果颜色
            else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor= (FruitColor) field.getAnnotation(FruitColor.class);
                strFruitColor=strFruitColor+fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }
            //水果供应者
            else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider= (FruitProvider) field.getAnnotation(FruitProvider.class);
                strFruitProvicer=" 供应商编号："+fruitProvider.id()+" 供应商名称："+fruitProvider.name()+" 供应商地址："+fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
        }
    }
}
