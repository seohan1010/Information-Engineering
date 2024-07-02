// 18. 다음 자바 코드에 나타난 것과 같이 동일한 이름의 메시지로 다른 구현을 호출할 수 있는
// 객체지향 개념은?



class Animal{
    void makeSound(){}
}

class Dog extends Animal{

    @Override
    void makeSound(){
        System.out.println("this is dog");
    }
}

class Cat2 extends Animal{

    @Override
    void makeSound(){
        System.out.println("this is cat");
    }


}


class Cat extends Animal{


    public static void main(String[] args) {


        Animal a = new Dog();
        Animal b = new Cat2();


        a.makeSound();
        b.makeSound();


    }


}


public class Exercise_18 {
}
