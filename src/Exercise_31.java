// 31. 다음 Java 프로그램의 실행 결과는?


interface A10{

    int a =2;

}


class B10 implements A10 {

    int b;
    B10(int i){
       b = i * a;
    }

    int getb(){
        return b;
    }




}


public class Exercise_31 {

    public static void main(String[] args) {

        int a = 3;
        B10 b1 = new B10(1);
        System.out.println(b1.getb());


    }

}
