// 48. 다음 Java 프로그램이 실행되었을 때의 결과는?

class arrayl{

    public static void main(String[] args) {

        int cnt = 0;
        do{
            cnt++;
        }while(cnt < 0);

        if(cnt == 1)
            cnt++;
        else
            cnt = cnt + 3;
        System.out.printf("%d",cnt);

    }

}


public class Exercise_48 {
}
