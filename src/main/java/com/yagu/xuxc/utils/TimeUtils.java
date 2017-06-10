package com.yagu.xuxc.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类 格式转发
 * 
 * @author xuxc
 * @since 20170425
 *
 */
public class TimeUtils {

    /**
     * 时间对象（Date）转化为年-月 格式字符串
     * 
     * @author xuxc
     * @since 2017年5月4日 上午9:40:18
     * @param date
     * @return
     */
    public static String FormatYM(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        Date now = new Date();
        String time = format.format(now);
        return time;
    }

    /**
     * 将时间对象（Date）转化为年-月-日 格式字符串
     * 
     * @author xuxc
     * @since 2017年5月4日 上午9:40:26
     * @param date
     * @return
     */
    public static String FormatYMD(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        String time = format.format(now);

        return time;
    }

    /**
     * 将时间对象（Date）转化为年-月-日 时 格式字符串 24小时制
     * 
     * @author xuxc
     * @since 2017年5月4日 上午9:40:34
     * @param date
     * @return
     */
    public static String FormatYMDH(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH");
        Date now = new Date();
        String time = format.format(now);

        return time;
    }

    /**
     * 将时间对象（Date）转化为年-月-日 时-分 格式字符串 12小时制
     * 
     * @author xuxc
     * @since 2017年5月4日 上午9:40:41
     * @param date
     * @return
     */
    public static String FormatYMDHM(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh-mm");
        Date now = new Date();
        String time = format.format(now);

        return time;
    }

    /**
     * 将时间对象（Date）转化为年-月-日 时-分-秒 格式字符串 12小时制
     * 
     * @author xuxc
     * @since 2017年5月4日 上午9:40:54
     * @param date
     * @return
     */
    public static String FormatYMDHMS(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        Date now = new Date();
        String time = format.format(now);

        return time;
    }

    /**
     * 剔除字符串中的-短横线
     * 
     * @author xuxc
     * @since 2017年5月4日 上午9:41:20
     * @param time
     * @return
     */
    public static String replaceHorizontalLine(String time) {
        time = time.replace("-", "");
        return time;
    }

    /**
     * 将时间戳转化为小时数 最小单位半小时 使用方法为java自带的Math类
     * 
     * @author xuxc
     * @since 2017年5月4日 上午9:19:41
     * @param time
     * @return
     */
    public String MathTime(long time) {
        double hour = time / (1000 * 60 * 60.0);
        int Bit = (int) Math.floor(hour);
        StringBuffer sb = new StringBuffer();
        sb.append(Bit);
        double z = hour - Bit;
        if (z > 0.5) {
            sb.append(".");
            sb.append(5);
        }
        return sb.toString();
    }

    /**
     * 将时间戳转化为小时数 最小单位半小时 使用方法为string.split方法
     * 
     * @author xuxc
     * @since 2017年5月4日 上午9:21:56
     * @param time
     * @return
     */
    public String MathTime2(long time) {
        double hour = time / (1000 * 60 * 60.0);
        String[] arr = String.valueOf(hour).split("\\.");
        int z = Integer.valueOf(arr[1].substring(0, 1));
        StringBuffer sb = new StringBuffer();
        sb.append(arr[0]);
        if (z > 5) {
            sb.append(".");
            sb.append(5);
        }
        return sb.toString();
    }

    /**
     * 计算两个时分秒类型参数间的时间差 用来判断24小时之间的差距
     * 
     * @author xuxc
     * @since 2017年5月5日 上午11:58:05
     * @param end
     * @param start
     * @return 返回两者之差的毫秒数
     */
    public static long mathBetween(String end, String start) {
        long time = 0;
        String[] endArr = end.split(":");
        String[] startArr = start.split(":");

        if (endArr.length > 0 && startArr.length > 0) {
            int hour = Integer.valueOf(endArr[0]) - Integer.valueOf(startArr[0]);
            time = hour * 60 * 60 * 1000;
        } else if (endArr.length > 0) {
            int hour = Integer.valueOf(endArr[0]);
            time = hour * 60 * 60 * 1000;
        } else if (startArr.length > 0) {
            int hour = 0 - Integer.valueOf(startArr[0]);
            time = hour * 60 * 60 * 1000;
        }

        if (endArr.length > 1 && startArr.length > 1) {
            int minute = Integer.valueOf(endArr[1]) - Integer.valueOf(startArr[1]);
            time += minute * 60 * 1000;
        } else if (endArr.length > 1) {
            int minute = Integer.valueOf(endArr[1]);
            time += minute * 60 * 1000;
        } else if (startArr.length > 1) {
            int minute = 0 - Integer.valueOf(startArr[1]);
            time += minute * 60 * 1000;
        }

        if (endArr.length > 2 && startArr.length > 2) {
            int second = Integer.valueOf(endArr[1]) - Integer.valueOf(startArr[1]);
            time += second * 1000;
        } else if (endArr.length > 2) {
            int second = Integer.valueOf(endArr[1]);
            time += second * 1000;
        } else if (startArr.length > 2) {
            int second = 0 - Integer.valueOf(startArr[1]);
            time += second * 1000;
        }

        return time;
    }

    /**
     * 根据时分秒字符串计算毫秒数 从每日00:00:00计算
     * 
     * @author xuxc
     * @since 2017年5月5日 下午1:40:44
     * @param date
     * @return
     */
    public static long conversionMilliseconds(String date) {
        long time = 0;
        String[] dateArr = date.split(":");

        int hour = Integer.valueOf(dateArr[0]);
        time = hour * 60 * 60 * 1000;
        if (dateArr.length > 1) {
            int minute = Integer.valueOf(dateArr[1]);
            time += minute * 60 * 1000;
        }
        if (dateArr.length > 2) {
            int second = Integer.valueOf(dateArr[2]);
            time += second * 1000;
        }

        return time;
    }
}
