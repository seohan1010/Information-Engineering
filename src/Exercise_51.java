// 51. 다음 Java 프로그램이 실행될 때, ㄱ에 들어갈 내용은?
// ---> static 메서드 에서는 static 메서드만 호출할수 있다.
//      일반 메서드가 있는 객체의 생성여부를 확인할수 없기
//      때문이다.

class Test8{

    public static void main(String[] args) {


        System.out.println(check(1));

    }
   static String check(int num){
        return (num >= 0 ? "positive" : "negative");
    }

}


public class Exercise_51 {
}
