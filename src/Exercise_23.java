// 23. 다음 자바 프로그램의 실행 결과는?


import org.w3c.dom.ls.LSOutput;

class X{

    int i;
    X(){i = 10;}
    void print(){
        System.out.print(i+",");
    }

}


class Y extends X {

    int i = 15;
    int j = 10;
    Y(){j=20;}

    void print(){
        System.out.print(j+",");
    }

    void superprint(){
        super.print();
    }


}


class Z extends Y {

    int k;
    Z(){
        super();
        k = 30;
    }

    void print(){
        System.out.print(k+",");
    }

    void test(){

        print();
        super.superprint();
        System.out.print(super.j+",");
        System.out.println(i);

    }


}


public class Exercise_23 {


    public static void main(String[] args) {

        Z z = new Z();
        z.test();

    }

}
