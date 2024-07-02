class Person2 {

    String name;

    public Person2(String n) {
        name = n;
    }

    public void whoRU() {
        System.out.println(name + "입니다.");
    }
}

class Student extends Person2{


    String school;
    public Student(String n, String s){

        super(n);
        school = s;

    }


    public void whoRU(){
        System.out.println(school + "학교에 다니는 "+name+"입니다.");
    }


}

public class Exercise_26 {

    public static void main(String[] args) {
        Person2 obj = new Student("이흥직","수일중");
        obj.whoRU();
    }

}



