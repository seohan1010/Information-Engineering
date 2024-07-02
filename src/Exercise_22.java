// 22. 다음 자바 프로그램의 출력 결과는?


class Shape{

    void draw(){
        System.out.println("Shape");
    }

}

class Circle extends Shape{

    @Override
    void draw(){
        System.out.println("Circle");
    }

}


class Square extends Shape{

    @Override
    void draw(){
        System.out.println("Square");
    }


}
public class Exercise_22 {

    public static void main(String[] args) {


        Shape s1 = new Shape();
        Circle s2 = new Circle();
        Square s3 = new Square();
        Shape s;
        s = s1; s.draw();
        s = s2; s.draw();
        s = s3; s.draw();


    }

}


