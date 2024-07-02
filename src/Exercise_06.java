// 6. 다음 Java 프로그램에서 Example 클래스의 실행 결과는?


class Subject1 {

    protected int a = 1000;
    public int fun1(){
        return a;
    }

}



class Subject2 extends Subject1 {

    private int b = 5;

    public int fun2(){
        return a/b;
    }

}



public class Exercise_06{

    public static void main(String[] args) {

        Subject2 sub = new Subject2();
        System.out.println(sub.fun1());
        System.out.println(sub.fun2());

    }

}



