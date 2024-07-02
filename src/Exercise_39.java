// 39. 다음의 Java 프로그램의 결과를 쓰시오.
// ---> print(), println() 및 "{}"  중괄호의 존재 여부를 잘 확인하자.

import java.util.LinkedList;



class List{

    public static void main(String[] args) {


        LinkedList<Integer>  ds = new LinkedList<>();
        ds.addLast(new Integer(10));
        ds.addLast(new Integer(30));
        ds.addLast(new Integer(20));
        while(!ds.isEmpty())
            System.out.print(ds.removeLast()+" ");
            System.out.println();



    }

}


public class Exercise_39 {
}
