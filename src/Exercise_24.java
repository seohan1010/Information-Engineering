// 24. 다음 Java 프로그램이 실행되었을 때, 실행 결과는?


class Parent2{

    int compute(int num){


        if(num <=1 )
            return num;

            return compute(num - 1) + compute(num - 2);


    }


}


class Child2 extends Parent2{

    int compute(int num){

        if (num <= 1)return num;
        return compute(num-1) + compute(num - 3);

    }

}


public class Exercise_24 {

    public static void main(String[] args) {

        Parent2 obj = new Child2();
        System.out.println(obj.compute(4));

    }

}
