// 14. 다음 Java 프로그램을 실행한 결과 출력값을 쓰시오.

class A6{

    void f(){
        System.out.println("0");
    }
    void f(int i){
        System.out.println(i);
    }

    void f(int i,int j){
        System.out.println(i+j);
    }

    public static void main(String[] args) {

        A6 a = new A6();
        a.f(25,25);

    }

}


public class Exercise_14 {
}
