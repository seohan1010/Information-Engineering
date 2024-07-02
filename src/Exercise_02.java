class Ref {

int a;
Ref(int x){
    a = x;
}

int sum(Ref obj){

    int k;
    k = obj.a - a;
    a = 10;
    obj.a = 20;
    return k;
}


}

public class Exercise_02{

    public static void main(String[] args) {


        Ref obj1 = new Ref(3);
        Ref obj2 = new Ref(4);
        int k1 = obj2.sum(obj1);
        System.out.println(" k1="+k1);
        System.out.println(" obj1.a="+obj1.a);
        System.out.println(" obj2.a"+obj2.a);


    }


}
