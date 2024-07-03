// 11. 다음 Java 프로그램의 출력 값은?

class Super{

    Super(){
        System.out.print('A');
    }

    Super(char x){
        System.out.print(x);
    }

}


class Sub extends Super {


    Sub(){

        super(); // 아니 여기서 super()로 호출하네...
        System.out.print('B');

    }


    Sub(char x){
        this();
        System.out.print(x);
    }

}


public class Exercise_11 {

    public static void main(String[] args) {

        Super s1 = new Super('C');
        Super s2 = new Sub('D');

    }

}
