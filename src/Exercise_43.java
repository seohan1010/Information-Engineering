// 43. 다음 Java 프로그램의 실행 결과는?
// ---> static멤버와 일반 멤버 구분에 주의.
//      print()과 println() 또한 구별에 주의하자

class Main3{

    public static void main(String[] args) {


        TestClass2 ta = new TestClass2();
        TestClass2 tb = new TestClass2();
        TestClass2 tc = new TestClass2();
        System.out.print(++ta.b + ",");
        System.out.print(++tb.b + ",");
        System.out.print(tc.b + ",");
        System.out.print(++ta.a + ",");
        System.out.print(++tb.a + ",");
        System.out.print(tc.a);


    }

}

class TestClass2{

    public int a =20;
    static int b = 0;

}


public class Exercise_43 {
}
