// 34. 다음 Java 프로그램의 실행 결과는?
// print 및 println 구분 
// 괄호안의 문자 내용 확인하기


import jdk.jshell.spi.ExecutionControlProvider;

class TestException {

    public static void main(String[] args) {


        try{
            System.out.println("문장 A");
            foo();
            System.out.println("문장 B");

        }catch(Exception e){
            System.out.println("문장 C");
        }
        System.out.println("문장 D");
    }


    public static void foo() throws Exception { // 해당 메서드에서 발생하는 예외를
                                                // 매소드르 호출한 곳으로 넘겨준다.


        try{
            System.out.println("문장 E");
            throw   new Exception();
        }catch(Exception e){
            System.out.println("문장 F");
            throw e;
        }finally{ // finally의 코드는 예외 발생 여부와 상관없이 실행
            System.out.println("문장 G");
        }


    }

}


public class Exercise_34 {
}
