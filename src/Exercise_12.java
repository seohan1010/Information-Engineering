// 12. Java 프로그램의 실행 결과를 쓰시오


class A5 {

    int a = 10;
    public A5(){
        System.out.print('가');
    }

    public A5(int A){

        System.out.print('나');

    }

    public static void main(String[] args) {

        B4 b1 = new B4();
        A5 b2 = new B4(1); // B4 타입 객체를 A5 타입의 변수에 대입
        System.out.print(b1.a+b2.a);
        // B4 타입의 필드 a와 A5 타입의 필드 a를 더해준다.

    }


}



class B4 extends A5 {

    int a = 20;
    public B4(){
        // super()가 생략
        System.out.print('다');
    }

    public B4(int x){
        // super()가 생략
        System.out.print('라');
    }

}


public class Exercise_12 {





}
