// 40. 다음 Java 프로그램의 실행 결과를 쓰시오.

import java.util.LinkedList;

class ListTest{


    public static void main(String[] args) {

        LinkedList<Integer> myLL = new LinkedList<>();


        myLL.addFirst(new Integer(10));
        myLL.addFirst(new Integer(20));
        myLL.addFirst(new Integer(30));
        while(!myLL.isEmpty()){
            Integer num = myLL.removeFirst();
            System.out.printf("%d",num);
        }


    }


}



public class Exercise_40 {
}