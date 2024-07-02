public class Main {

    private int a;
    public void set(int a){
        this.a=a;
    }

    public void add(int d){
                a+=d;

    }

    public void print(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Main p = new Main();
        Main q;

        p.set(10);
        q=p;
        p.add(10); //20
        q.set(30);  // 30
        p.print(); //

        // q에는 p의 객체 주소가 들어가 있기 때문에
        // 같은 객체의 상태?변경하게 된다.


    }




}