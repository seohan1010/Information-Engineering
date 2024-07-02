// 36. 다음 Java 프로그램의 실행 결과를 쓰시오.
// print() println()을 잘 구분하자.

class Division{

    public static void main(String[] args) {


        int a, b, result;
        a = 3;
        b = 0;

        try{

            result = a / b;
            System.out.print("A");

        }catch(ArithmeticException e){
            System.out.print("B");
        }finally{
            System.out.print("C");
        }
        System.out.print("D");



    }


}



public class Exercise_36 {
}
