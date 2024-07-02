// 49. 다음 Java 코드가 실행되었을 때, 실행 결과는?


class Ape {


    static void rs(char a[]) {


        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'B')
                a[i] = 'C';
            else if (i == a.length - 1)
                a[i] = a[i - 1];
        }

    }

    static void pca(char a[]) {

        for(int i = 0 ; i < a.length ; i++ )
            System.out.print(a[i]);
        System.out.println();

    }


    public static void main(String[] args) {

        char c[] = {'A','B','D','D','A','B','C'};
        rs(c);
        pca(c);

    }

}


public class Exercise_49 {
}
