// 38. 다음 Java 프로그램의 실행 결과는?

public class Exercise_38 {

    public static void main(String[] args) {


        String str1  = "Programming";
        String str2 = "Programming";
        String str3 = new String("Programming");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));


    }

}
