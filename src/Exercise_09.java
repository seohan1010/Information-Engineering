import java.lang.reflect.Method;

class A4{

    int a ;
    A4(int a){
        this.a = a;
    }

    void display(){
        System.out.println("a="+a);
    }


}


class B3 extends A4 {


    @Override
            void display(){
        System.out.println("this is from B3");
    }

    B3(int a){
        super(a);
        super.display();
        this.display();
        display();
        System.out.println(B3.this);
        System.out.println(this);

    }

}


public class Exercise_09 {

    public static void main(String[] args) {

        B3 obj = new B3(10);



        Method[] method = obj.getClass().getMethods();
        System.out.println(method.length);
        for(Method m: method){
            System.out.println(m);
        }
    }

}
