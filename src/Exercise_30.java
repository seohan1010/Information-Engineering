// 30. 다음 자바 코드에서 오류가 발생하는 문장은?


abstract class Shape3{

    public void paint(){draw();}
    abstract public void draw();

}



abstract class Circle2 extends Shape3{

    public int radius;
    public Circle2(int radius){

        this.radius = radius;

    }

    double getArea()
    {
        return (3.14 * radius * radius);
    }

}

class NamedCircle extends Circle2 {


    String name;
    public NamedCircle(int radius, String name){


        super(radius);
        this.name = name;


    }


    public void draw(){

        System.out.println("반지름이 "+radius +"인 원을 그리다.");

    }
}



public class Exercise_30 {

    public static void main(String[] args) {


        Shape3 s;
//        s = new Shape3(); // 추상클래스는 객체 생성 불가
        NamedCircle w = new NamedCircle(5,"Ring");
        System.out.println(w.getArea());
        w.draw();



    }

}
