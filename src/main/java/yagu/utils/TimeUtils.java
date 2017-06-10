package yagu.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**时间工具类
 * 格式转发
 * @author xuxc
 * @since 20170425
 *
 */
public class TimeUtils {

    /**
     * 时间对象（Date）转化为年-月 格式字符串
     * 
     * @param d1
     * @return
     */
    public static String FormatYM(Date d1) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        Date now = new Date();
        String time = format.format(now);
        return time;
    }

    /**
     * 将时间对象（Date）转化为年-月-日 格式字符串
     * 
     * @param d1
     * @return
     */
    public static String FormatYMD(Date d1) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        String time = format.format(now);

        return time;
    }
    
    /**
     * 将时间对象（Date）转化为年-月-日 时 格式字符串
     * 
     * @param d1
     * @return
     */
    public static String FormatYMDH(Date d1) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH");
        Date now = new Date();
        String time = format.format(now);

        return time;
    }
    /**
     * 将时间对象（Date）转化为年-月-日 时-分 格式字符串
     * 
     * @param d1
     * @return
     */
    public static String FormatYMDHM(Date d1) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh-mm");
        Date now = new Date();
        String time = format.format(now);

        return time;
    }
    
    /**
     * 将时间对象（Date）转化为年-月-日 时-分-秒 格式字符串
     * 
     * @param d1
     * @return
     */
    public static String FormatYMDHMS(Date d1) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        Date now = new Date();
        String time = format.format(now);

        return time;
    }

    /**
     * 剔除字符串中的-短横线
     * 
     * @param time
     * @return
     */
    public static String replaceHorizontalLine(String time) {
        time = time.replace("-", "");
        return time;
    }
}
