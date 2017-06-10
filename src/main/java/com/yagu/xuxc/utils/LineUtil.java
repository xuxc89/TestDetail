package com.yagu.xuxc.utils;

import java.lang.reflect.Field;

/**
 * 为页面textarea准备方法
 * 使页面显示格式化
 * @author xuxc
 * @since 2017年5月4日 上午9:27:15
 * @param <T>
 */
public class LineUtil<T> {
    /**
     * 将默认的\n转义为ASCII码表
     * @author xuxc
     * @since 2017年5月4日 上午9:28:08
     * @param text
     * @return
     */
    public static String replaceLineFeed(String text){
        if(text.contains("\n")){
            text = text.replaceAll("\\n", "&#10;");
        }
        if(text.contains("\r")){
            text = text.replaceAll("\\r", "&#10;");
        }
        
//        text.replaceAll("\\r", "&#10;");
        return text;
    }
    
    /**TODO
     * 未完成
     * 预计使用反射方法将类中的String类型全部进行判断并将需要的内容转义
     * @author xuxc
     * @since 2017年5月4日 上午9:29:21
     * @param t
     */
    public <T> void replace(T t){
        Class c = t.getClass();
        Field[] field = c.getDeclaredFields();
        for(Field f:field){
            if((f.getType()).equals("String")){
            }
        }
    }
}
