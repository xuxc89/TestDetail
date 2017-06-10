/**
 * @author xuxc
 * @since 2017年6月1日 下午2:19:17
 */
package yagu.xuxc;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * @author xuxc
 * @since 2017年6月1日 下午2:19:17
 */
public class BigDecimalExercise {
    
    @Test
    public void test() {
//        doubleCaseString();
        keepTwoDecimalPlaces();
    }
    
    public void doubleCaseString() {
        BigDecimal b1 = new BigDecimal(2.00);
       
        //类型为double时 实际存储数据为不定小数
        System.out.println( "double");
        System.out.println( b1.subtract(new BigDecimal(1.10)));
        System.out.println( "Double.toString");
        System.out.println( b1.subtract(new BigDecimal(Double.toString(1.10))));
    }
    
    public void keepTwoDecimalPlaces () {
        BigDecimal b1 = new BigDecimal(2.00);
        
        //类型为double时 实际存储数据为不定小数
        System.out.println( "double");
//        System.out.println( b1.divide(new BigDecimal(1.10)));
        //结果为2
        System.out.println( b1.divide(new BigDecimal(1.10),2));
        //结果为3
        System.out.println( b1.divide(new BigDecimal(1.10),3));
        //保留小数点后两位
        System.out.println( b1.divide(new BigDecimal(1.10),2,BigDecimal.ROUND_UP));
    }
}
