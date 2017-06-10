package com.yagu.xuxc.utils;

import java.util.List;

/**
 * List工具类
 * 
 * @author xuxc
 * @since 2017年5月4日 上午9:31:45
 * @param <T>
 */
public class ListUtils<T> {

    /**
     * 判断是否否为空
     * 
     * @author xuxc
     * @since 2017年5月4日 上午9:31:59
     * @param list
     * @return true 为空 false 非空
     */
    public static <T> boolean checkEmpty(List<T> list) {

        if (list != null) {
            if (list.isEmpty()) {
                return true;
            }
        }
        return false;

    }
}
