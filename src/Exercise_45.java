// 45. 다음 Java 프로그램은 3의 배수를 제외한
//     1부터 10까지의 정수의 누적 합이 10을 초과하는
//     최초 시점의 합을 출력하는 프로그램이다.
//     ㄱ과 ㄴ에 들어가는 내용으로 적절한 것은?


class JavaApplication{


    public static void main(String[] args) {

        int i = 0, sum = 0;
        while(i < 10){


            i++;
//            if( i%3 == 0 )  ㄱ
//            if( sum > 10 )  ㄴ
            sum+=i;

        }
        System.out.println("sum = " + sum);

    }


}

public class Exercise_45 {

}
