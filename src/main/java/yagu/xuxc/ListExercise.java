package yagu.xuxc;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListExercise {

    @Test
    public void test(){
        testList();
    }
    
    void testList(){
        List list = new ArrayList<>();
//        System.out.println(Objects.isNull(list));
        System.out.println(list.isEmpty());
    }
}
