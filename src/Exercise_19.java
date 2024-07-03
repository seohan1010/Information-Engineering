// 19. 다음 Java 프로그램의 실행 결과는?
// 다형성은 부모객체의 메서드를 오버라이딩 했을때
// 부모 타입으로 객체를 생성하고 부모 필드의 메서드를
// 호출했을때, 자식 객체에 오버라이딩된
// 메서드를 호출하게 된다.
// 또한 static 멤버는 오버라이딩 될 수 없는거 같다.

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
        B6 b = new B6();
        B6.f();


    }

}
