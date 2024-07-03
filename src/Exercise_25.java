class A9 {

    int i;
    public A9(int i){
        this.i = i;
    }

    int get(){return i;}


}

class B9 extends A9{

    int i;
    public B9(int i){
        super(2*i);
        this.i = i;
    }

    int get(){
        return i;
    }

}

// 문제를 풀기전에 객체의 타입과 오버라이딩에 대해서 다시한번 생각해보자
// 그리고 오버라이딩을 오버로딩과 혼돈하지 말자.

public class Exercise_25 {

    public static void main(String[] args) {

        A9 ab = new B9(7);
        System.out.println(ab.i + ", "+ab.get());
        // 여기서의 ab.i는 A9 타입의 i를 말한다. ab에는 B9의 객체가 들어있지만,
        // B9에는 A9의 필드와 메서드도 함께 있기 때문에
        // ab변수의 타입에 따라서 필드 혹은 메서드를 가지고 오게 된다.

        // 아래와 같이 변수 ab를 B9타입으로 형변환 해주면,
        // B9타입의 i값을 가져다가 사용할수 있다.
        B9 b = (B9)ab;
        System.out.println("b.i = " + b.i);

    }

}








