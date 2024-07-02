// 15. 다음 Java 프로그램의 실행 결과를 쓰시오
// ---> 형변환 관련 문제


class Calculate {


    public int cal(int a, int b){
        return a-b;
    }

    public float cal(float a, float b){
        return a - b;
    }

    public double cal(double a, double b){
        return a+b;
    }

    public int cal(int a, int b, int c){
        return a+b+c;
    }



}


public class Exercise_15 {

    public static void main(String[] args) {

        Calculate a = new Calculate();
        System.out.println(a.cal(31,69,25));
        System.out.println(a.cal(24.8,5.1));
    }


}
