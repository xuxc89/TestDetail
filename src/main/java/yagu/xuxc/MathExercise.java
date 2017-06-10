package yagu.xuxc;

public class MathExercise {

    /**
     * 方法加0.5后舍弃小数点后
     */
    public void roundTest(){
        System.out.println(Math.round(1.6));
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(1.3));
        
        System.out.println("----------------------------------------------");
        
        System.out.println(Math.round(-1.3));
        System.out.println(Math.round(-1.5));
        System.out.println(Math.round(-1.6));
    }
}
