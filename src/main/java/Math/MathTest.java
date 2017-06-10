/**
 * @author xuxc
 * @since 2017年5月3日 下午5:28:23
 */
package Math;

import java.util.Date;

import org.junit.Test;

/**
 * @author xuxc
 * @since 2017年5月3日 下午5:28:23
 */
public class MathTest {

    @Test
    public void test() {
//        double b = 1.9;
//        double i =Math.floor(1.1);
//        System.out.println(i);
        Date date = new Date();
        Date now = new Date();
        date.setDate(date.getDate()-1);
//        long l = now.getTime() - date.getTime();
        long l = 85680220l;
        MathTime(l);
        MathTime2(l);
//        MathTime3(l);
        
    }
    
    public String MathTime(long time) {
        double hour = time/(1000*60*60.0);
        int Bit =  (int)Math.floor(hour);
        StringBuffer sb = new StringBuffer(); 
        sb.append(Bit);
        double z = hour-Bit;
        if(z>0.5){
            sb.append(".");
            sb.append(5);
        }
        return sb.toString();
    }
    
    public String MathTime2(long time) {
        double hour = time/(1000*60*60.0);
        String[] arr = String.valueOf(hour).split("\\.");
        int z = Integer.valueOf(arr[1].substring(0, 1));
        StringBuffer sb = new StringBuffer(); 
        sb.append(arr[0]);
        if(z>5){
            sb.append(".");
            sb.append(5);
        }
        return sb.toString();
    }
    
    /**
     * 失败方法
     * @author xuxc
     * @since 2017年5月4日 上午9:17:59
     * @param time
     * @return
     */
//    public String MathTime3(long time) {
//        double hour = time/(1000*60*60.0);
//        System.out.println(hour);
//        int hours = (int)(hour*10);
//        System.out.println(hours);
//        int i = hours%10;
//        
//        System.out.println(i);
//        return "";
//    }
}
