// 19. 다음 Java 프로그램의 실행 결과는?



class A7{



    static void f(){
        System.out.print("1 ");
    }

    void g(){
        System.out.print("2 ");
    }



}


class B6 extends A7{
    static void f(){
        System.out.print("3 ");
    }
    void g(){
        System.out.print("4 ");
    }
}

public class Exercise_19 {

    public static void main(String[] args) {

        A7 a = new B6();
        a.f();
        a.g();


    }

}
