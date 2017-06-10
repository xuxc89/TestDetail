package com.yagu.xuxc.utils;

/**
 * 
 * @author xuxc
 * @since 2017年5月4日 上午9:38:52
 */
public class StringUtils {

    /**
     * 字符串非空并且非null判断
     * 
     * @param str
     * @return
     * @since20170427
     */
    public static boolean notEmpty(String str) {
        if (null == str) {
            return false;
        }
        // 字符串中只要有一位为非''通过校验
        if (str.trim().length() == 0) {
            return true;
        }
        return false;
    }

    /**
     * 字符串非空并且非null并且不为请选择
     * 一般为下拉菜单传入参数
     * @param str
     * @return
     * @since20170427
     */
    public static boolean selectNotEmpty(String str) {
        if (null == str||("请选择").equals(str)) {
            return false;
        }
        // 字符串中没有有一位为非''校验
        if (str.trim().length() == 0) {
            return false;
        }
        return true;
    }
}
