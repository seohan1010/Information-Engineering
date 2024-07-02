// 53. 다음 Java 프로그램이 실행되었을 때, 실행 결과는?
// ---> 한번 잘려나간 옥텟의 비트는 해당 위치가 다시 돌아왔을때
//       값이 0이다.

class Test11 {

    public static void main(String[] args) {

        int a = 101;
        System.out.println((a >> 3) <<2);

    }

}

public class Exercise_53 {
}
