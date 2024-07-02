// 01. 다음 Java 프로그램의 실행 결과는?

class C1{

    private int a;
    public void set(int a){
        this.a = a;
    }

    public void add(int d){
        a+=d;
    }

    public void print(){
        System.out.println(a);
    }

    public static void main(String[] args) {

        C1 p = new C1();
        C1 q;
        p.set(10);
        q = p;
        p.add(10);
        q.set(30);
        p.print();

    }



}

public class Exercise_01 {
}
