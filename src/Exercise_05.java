
//5. A 클래스에서 사용할 수 있는 객체 변수들로 옰은 것만을 쓰시오

import java.lang.reflect.Field;

class A1 {

    public int x;
    private int y;
    protected int z;


}



class A2 extends A1 {

    protected int a;
    private int b;


}


class A3 extends A2 {

    private int q;

}


public class Exercise_05 {

    public static void main(String[] args) {

        A3  a = new A3();




    }

}