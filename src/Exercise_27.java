// 27. 다음 Java 프로그램의 출력 결과는?
// ---> hint 메서드 오버로딩

class Foo{

    public int a = 3;
    public void addValue(int i){
        a = a + i;
        System.out.println("Foo : "+ a + " ");

    }

    public void addFive(){
        a+=5;
        System.out.println("F00 : "+ a + " ");
    }



}


class Bar extends Foo {


    public int a = 8;
    public void addValue(double i){
        a = a + (int)i;
        System.out.println("Bar : "+ a + " ");
    }

    public void addFive(){
        a += 5;
        System.out.println("Bar : "+a+" ");
    }


}


public class Exercise_27 {

    public static void main(String[] args) {

        Foo f = new Bar();
        f.addValue(1);
        f.addFive();



    }

}
