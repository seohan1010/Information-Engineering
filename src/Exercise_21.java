// 21. Java 프로그램의 실행 결과는?

class A8 {
    public void f() {
        System.out.println("1");

    }

    public static void g() {
        System.out.print("2");
    }

}

class B7 extends A8 {


    public void f(){
        System.out.print("3");
    }



}


class C4 extends B7{

    public static void g(){
        System.out.print("4");
    }

}

public class Exercise_21 {

    public static void main(String[] args) {


        A8 obj = new C4();
        obj.f(); // A8의 f()를 오버라이딩한 B7의 f()를 호출
        obj.g(); // A8의 g()는 static 메서드 이므로 A8 클래스의 g()를 호출

    }

}
