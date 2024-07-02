// 42. 다음 Java 프로그램의 실행 결과는?

class Main2{

    public static void main(String[] args) {


        int a;
        a = 10;
        TestClass.b = a;
        TestClass tc = new TestClass();
        System.out.println(TestClass.b++);
        System.out.println(tc.b);
        System.out.println(a);
        System.out.println(tc.a);

    }

}



class TestClass{

    public int a = 20;
    static int b = 0;

}


public class Exercise_42 {
}
