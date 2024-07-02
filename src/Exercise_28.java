// 28. 다음 Java 프로그램의 출력 결과는?

class ClassP{


    int func1(int a, int b){
        return (a+b);
    }

    int func2(int a, int b){

        return (a-b);

    }

    int func3(int a, int b){
        return (a*b);
    }

}


class ClassA extends ClassP{


    int func1(int a, int b){
        return (a%b);
    }


    double func2(double a, double b){

        return (a*b);

    }

    int func3(int a, int b){

        return (a/b);

    }


    public static void main(String[] args) {

        ClassP p = new ClassA();

        System.out.println(p.func1(5,2)+","+p.func2(5,2)+","+p.func3(5,2));



    }



}



public class Exercise_28 {
}
