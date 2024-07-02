// 29. 다음 자바 프로그램이 오류 없이 실행되기 위해 밑줄 친 부분에 필요한 프로그램 코드는?


abstract class Test5{

    int data = 100;
    public abstract void printData();

}

class Inner{
        // 익명 클래스로 1회용 객체를 생성
    // ---> 생성과 동시에소멸
    Test5 test = new Test5(){

        public void printData(){
            System.out.println(data);
        }

    };


}



public class Exercise_29 {
    public static void main(String[] args) {

        Inner inner = new Inner();
        inner.test.printData();

    }

}
