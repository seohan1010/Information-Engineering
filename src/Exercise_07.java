

// 7. 다음 Java 프로그램의 실행 결과를 쓰시오

class Car {

    String model;

    Car() {
        this.model = "My Car";
    }

    Car(String model) {
        this.model = model;
    }

    void getModel(){
        System.out.println(this.model);
    }


}



public class Exercise_07 {


    public static void main(String[] args) {


        Car aCar = new Car("제네시스");
        Car bCar = new Car();
        aCar.getModel();
        bCar.getModel();

    }



}
