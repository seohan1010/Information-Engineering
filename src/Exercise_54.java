// 54. 다음 Java 프로그램이 실행되었을 때, 실행 결과는?
// ---> 문제를 똑바로 읽읍시다.

class Test12 {

    public static void main(String[] args) {

        int i, j, k;
        for (i = 1, j = 1, k = 0; i < 5; i++) {

            if((i % 2) ==0 )
                continue;
                k += i * j++; // ---> k = k + (i * j);
        }
        System.out.println(k);

    }

}

public class Exercise_54 {
}
