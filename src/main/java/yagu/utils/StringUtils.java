package yagu.utils;

public class StringUtils {

    /**
     * 字符串非空并且非null判断
     * @param str
     * @return
     */
    public static boolean checkString(String str) {
        if(null == str){
            return false;
        }
        
        if(str.trim().length() == 0){
          //字符串中只要有一位为非''通过校验
            return true;
        }
        return false;
    }
}
