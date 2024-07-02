// 56. 다음 자바 프로그램의 실행결과를 쓰시오.

class ParaPassing{

    public void change(int i, int[] j){
        i = 20;
        j[3] = 400;
    }

    public void display(int i, int[] j){
        System.out.println("i: "+i); // 넘겨 받은 10 출력
        System.out.print("j: ");
        for(int k = 0; k < j.length ; k++)
            System.out.print(j[k]+" ");  // 넘겨받은 배열의 메모리 주소에 있는 값을 하나씩 꺼내서 출력
        System.out.println();

    }

}


class ParaPassingTest{

    public static void main(String[] args) {

        ParaPassing pp = new ParaPassing();
        int i = 10, j[] = {1,2,3,4,};
        pp.change(i,j);
        pp.display(i,j);

    }

}



public class Exercise_56 {
}
