// 44. 다음 Java 프로그램의 실행 결과는?
// ---> 과연 이 문제가 나올 것인가?

class ArrayCloneTest{

    public static void main(String[] args) {

        int sum = 0;
        int[] mydream = new int[]{5,4,6,9,7,9};
        int[] mytarget = (int[])mydream.clone();
        for(int i = 0 ; i < mytarget.length ; i++ ){
            sum = sum + mytarget[i];
        }
        System.out.println(sum);
    }

}


public class Exercise_44 {
}
