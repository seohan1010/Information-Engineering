// 41. 다음 Java 프로그램의 실행 결과를 쓰시오.


class Student2{

    int id;
    char name;
    static int count = 0;
    Student2(){
        count++;
    }

}


class Studenttest{

    public static void main(String[] args) {



        Student2 man1 = new Student2();
        Student2 man2 = new Student2();
        Student2 man3 = new Student2();
        Student2 man4 = new Student2();
        System.out.println(Student2.count);



    }


}


public class Exercise_41 {
}
