// 33. 다음 자바 프로그램 실행 시 출력되는 문자를 순서대로 쓰시오
// 데이터 출력 함수가 print()인지 println인지를 정확하게 확인하자.

class ExceptionTest{

    ExceptionTest(){

        try {

            method();
            System.out.println("A");

        }catch(Exception e){
            System.out.println("B");
        }finally{
            System.out.println("C");
        }
        System.out.println("D");

    }

    void method(){}

    public static void main(String[] args) {
        ExceptionTest t = new ExceptionTest();
    }

}


public class Exercise_33 {
}
