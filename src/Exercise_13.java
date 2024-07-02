// 13. 다음은 Java로 작성된 프로그램이다. 이를 실행한 결과를 쓰시오.

class Parent{


    int x = 100;
    Parent(){
        this(500);
    }

    Parent(int x){
        this.x = x;
    }

    int getX(){
        return x;
    }
}


class Child extends Parent{

    int x = 2000;
    Child(){
        this(50000);
    }

    Child(int x ){
        this.x = x;
    }



    public static void main(String[] args) {

        Child obj = new Child();
        System.out.println(obj.getX());

    }


}


public class Exercise_13 {





}
