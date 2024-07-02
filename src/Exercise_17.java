// 17. 다음의 Java 프로그램에서 사용된 기법은?

class Adder{

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }


}


class Computer extends Adder{

    private int x;
    public int calc(int a, int b, int c){


        if(a==1)return  add(b,c);
        else return x;

    }

}


public class Exercise_17 {

    public static void main(String[] args) {

        Computer c = new Computer();
        System.out.println("100 + 200 = "+c.calc(1,100,200));
        System.out.println("5.7 + 9.8 + "+c.add(5.7,9.8));


    }


}
