package yagu.xuxc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import yagu.utils.LineUtil;

public class StringExercise {

    @Test
    public void run() {
//        trim();
//        replace();
//        pinjie();
//        test_equals();
//        Number();
        caseInteger();
    }

    public void test_equals() {
        String s1 = "hello";
        String s2 = s1;
        String s3 = new String(s1);
        String s4 = "hello";
        String s5 = new String("hello");
        String s6 = new String("hello");
        
        System.out.println("s2.equals"+"   "+s1.equals(s2));
        System.out.println("s2=="+"   "+s1==s2);
        System.out.println("s3.equals"+"   "+s1.equals(s3));
        System.out.println("s3=="+"   "+s1==s3);
        System.out.println("s4.equals"+"   "+s1.equals(s4));
        System.out.println("s4=="+"   "+s1==s4);
        System.out.println("s5.equals"+"   "+s1.equals(s5));
        System.out.println("s5=="+"   "+s1==s5);
        System.out.println("s6.equals"+"   "+s6.equals(s5));
        System.out.println("s5=="+"   "+s6==s5);
    }
    
    public void Number(){
        int equelsTrue = 0;
        int equelsFalse = 0;
        int True = 0;
        int Fales = 0;
        
        int equelsTrue2 = 0;
        int equelsFalse2 = 0;
        int True2 = 0;
        int Fales2 = 0;
        for(int i = 0 ; i<100 ;i++) {
            String s1 = String.valueOf(i);
            String s2 = String.valueOf(i);
            String s3 = i+"";
            String s4 = i+"";
            
            if(s1.equals(s2)){
                equelsTrue++;
                System.out.println("i="+i+"时,eqluals结果为true");
            }else{
                equelsFalse++;
                System.out.println("i="+i+"时,eqluals结果为false");
            }
            if(s3.equals(s4)){
                equelsTrue2++;
                System.out.println("i="+i+"时,eqluals结果为true");
            }else{
                equelsFalse2++;
                System.out.println("i="+i+"时,eqluals结果为false");
            }
            
            if(s1 == s2){
                True++;
                System.out.println("i="+i+"时,==结果为true");
            }else{
                System.out.println(s3.hashCode());
                System.out.println(s4.hashCode());
                Fales++;
                System.out.println("i="+i+"时,==结果为false");
            }
            
            if(s3 == s4){
                True2++;
                System.out.println("i="+i+"时,==结果为true");
            }else{
                System.out.println(s3.hashCode());
                System.out.println(s4.hashCode());
                Fales2++;
                System.out.println("i="+i+"时,==结果为false");
            }
            System.out.println();
            
        }
        
        System.out.println("循环结束时 equals返回true" + equelsTrue);
        System.out.println("循环结束时 equals返回false" + equelsFalse);
        System.out.println("循环结束时 ==返回true" + True);
        System.out.println("循环结束时 ==返回false" + Fales);
        
        System.out.println("循环结束时 equals返回true" + equelsTrue2);
        System.out.println("循环结束时 equals返回false" + equelsFalse2);
        System.out.println("循环结束时 ==返回true" + True2);
        System.out.println("循环结束时 ==返回false" + Fales2);
    }
    
    public void list() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(1);
            list.add(i);
        }
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list);
    }

    public void replace() {
        String line = "aaa\naaa\n";
        String s = LineUtil.replaceLineFeed(line);
        String newLine = "aaaa\tbbb\rccc";
        System.out.println(s);
        System.out.println(newLine);
        System.out.println(LineUtil.replaceLineFeed(newLine));
    }

    public void checkString() {
        String space = "   ";
        boolean b = StringUtils.isNotBlank(space);
        int strLen = space.length();
        if (space == null || (strLen = space.length()) == 0) {
            System.out.println("in");
        }
        System.out.println(strLen);
        System.out.println(space.trim().length());
        System.out.println(b);
        
        if(space == null || space.trim().length() == 0){
            
        }
    }
    
    public void trim(){
        String s1 = "   1 1 ";
        System.out.println(s1.trim().length());
    }
    
    public void pinjie(){
        double by = 1.0;
        //待审批
        double pending = 1.0;
        //驳回
        double turnDown = 2.0;
        
//        double count = by+pending+turnDown;
        String result = by+pending+turnDown+","+by;
        System.out.println(result);
    }
    
    public void caseInteger() {
        String s1 = "1";
        for(int i = 0 ; i<1000000 ; i++) {
//            Integer.valueOf(s1);
            new Integer(s1);
        }
    }
}
