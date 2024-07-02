// 57. 다음 Java 프로그램의 실행 결과를 쓰시오


class Triangular {

    public static void main(String[] args) {

        int value = tri(100);
        System.out.println("결과 = " + value);

    }

    public static int tri(int n){

        if (n == 1)
            return 1;
        else
            return (n + tri(n-1));

    }


}


public class Exercise_57 {
}
