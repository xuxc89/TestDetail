package yagu.utils;

import java.util.List;

public class ListUtils {

    public static boolean checkEmpty(List list) {

        if (list != null) 
            if (list.isEmpty())
                return true;
                return false;
    }
}
