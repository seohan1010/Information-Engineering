// 35. 다음 Java 언어로 작성한 프로그램의 실행 결과는?


class Test6{

    public static void main(String[] args) {


        int ar[] = {10,20,30,40,50};
        int sum = 0, a = 100, b = 0;
        try{

            for(int i = 0; i < ar.length ;i++){
                sum+=ar[i];
            }
            System.out.println(sum);

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Array Index Out Of Bounds Exception");

        }

        try{


            float z = a / b;
            System.out.println(z);

        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }

    }

}


public class Exercise_35 {



}
