/**
 * @author xuxc
 * @since 2017年6月1日 上午10:23:53
 */
package yagu.xuxc;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author xuxc
 * @since 2017年6月1日 上午10:23:53
 */
public class CalendarExercise {
    
    private SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd hh-mm-ss");
    
    public void printYMD() {
        Calendar time = Calendar.getInstance();
        System.out.println(Calendar.YEAR);
        System.out.println(time.getWeekYear());
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(time.DAY_OF_MONTH);
        System.out.println(time.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
    
    public void getFristTime() {
        Calendar startTime = Calendar.getInstance();
        startTime.add(Calendar.MONTH, 0);
        System.out.println(format.format(startTime.getTime()));
        startTime.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(format.format(startTime.getTime()));
    }
    
    public void getLastDate() {
        Calendar endTime = Calendar.getInstance();
        //将月份设置为上月
        endTime.add(Calendar.MONTH, 1);
        System.out.println(format.format(endTime.getTime()));
        //将日期设置为本月一号
        endTime.set(Calendar.DAY_OF_MONTH, 0);
        System.out.println(format.format(endTime.getTime()));
        
    }
    
    public void kuaNian() {
        Calendar endTime = Calendar.getInstance();
        
        endTime.set(2017, 11, 31);
        System.out.println(endTime);
        System.out.println(endTime.getTime());
        System.out.println(format.format(endTime.getTime()));
    }
    
}
