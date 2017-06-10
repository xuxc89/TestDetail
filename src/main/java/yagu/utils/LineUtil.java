package yagu.utils;

import java.lang.reflect.Field;

public class LineUtil<T> {
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
    
    public <T> void replace(T t){
        Class c = t.getClass();
        Field[] field = c.getDeclaredFields();
        for(Field f:field){
            if((f.getType()).equals("String")){
            }
        }
    }
}
