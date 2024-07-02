// 8.다음 Java 프로그램의 실행 결과를 쓰시오

class A {

    A(){System.out.printf("%d ", 10);}

}


class B extends A {

    B(int a){// 모든 생성자의 첫줄에는 부모 생성자를 호출 하는 super()가 들어가 있다.
        System.out.printf("%d ", a);
    }

}


class C2 extends B {

    C2(int a){
        super(a/10);
        System.out.printf("%d ", a);
    }

}



public class Exercise_08{

    public static void main(String[] args) {

        A b = new C2(1000);

    }


}