/**
 * @author xuxc
 * @since 2017年5月11日 下午5:51:50
 */
package yagu.xuxc;

import org.junit.Test;

/**
 * @author xuxc
 * @since 2017年5月11日 下午5:51:50
 */
public class StaticExercise {

    
    int i = 0;
    
    @Test
    public void test() {
        
    }
    
    public static void function(){
        //非静态变量调用时会报错
//        System.out.println(i);
    }
}
