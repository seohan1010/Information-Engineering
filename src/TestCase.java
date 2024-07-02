




interface Interface{}

public class TestCase {

    public static void main(String[] args) {


        int test = 11 >> 1 ;
        System.out.println("test = " + test);
        System.out.println(Integer.toBinaryString(test));
        int test2 = test <<1;
        System.out.println("test = " + test2);
        System.out.println(Integer.toBinaryString(test2));
    }

}
