package yagu.xuxc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import yagu.bean.TestBean;

public class DateExercise {
    // @Autowired
    // private TestBean testBean;

    @Test
    public void main() throws ClassNotFoundException, NoSuchMethodException, SecurityException {
        // simpleDateFormatTest();
//        testBean();
//        initDate();
        reset();
    }
    
    private void reset() {
        Date now = new Date();
        System.out.println(now);
        now.setDate(now.getDate()-3);
        System.out.println(now);
        
        System.out.println("-----------------------------------------");
        /**
         * date结果与day不同
         * 30
         * day结果为周几
         * 
         */
        System.out.println(now.getDate());
        System.out.println(now.getDay());
    }

    public void simpleDateFormatTest() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        Date now = new Date();
        String t = format.format(now);
        t = t.replace("-", "");
        System.out.println(t);
    }

    public void testBean() throws ClassNotFoundException, NoSuchMethodException, SecurityException {
        TestBean testBean = new TestBean();
        Class c = testBean.getClass();
        Class c1 = Class.forName("yagu.bean.TestBean");
        // System.out.println(c);
        // System.out.println(c.getName());
        // System.out.println(c.getSimpleName());
        System.out.println(c.getName());
        // 所有本身参数不包括继承
        Field[] field = c.getDeclaredFields();
        // 所有可见参数包括继承
        Field[] field02 = c.getFields();
        // 所有本身方法不包括继承
        Method[] method = c.getDeclaredMethods();
        // 所有可见方法包括继承
        Method[] method02 = c.getMethods();

        // Method me = c.getMethod("count", null);
        // System.out.println(me.getName());

        for (Field f : field) {
            System.out.println(f.getType());
            if ((f.getType()).equals("int")) {
                System.out.println("true");
            }
        }
    }

    private void initDate() {
        Date date = new Date();
        System.out.println(date);
    }
}
