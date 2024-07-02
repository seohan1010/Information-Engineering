// 58. 다음은 정수를 저장할 수 있는 스택을 Java로 구현한 것이다.
//     ㄱ과 ㄴ에 넣을 문장으로 옳은 것은?

class StackInt {


    int size, top;
    int buf[];

    public StackInt(int s) {
        buf = new int[s];
        size = s;
        top = -1;
    }

    public void push(int x) {
        buf[++top] = x; // 포인터의 크기를 먼저 늘린뒤에 값을 할당
    }


    public int pop() {
        return buf[top--]; // 포인터가 가리키고 있는 곳의 데이터를 꺼낸다음에 값을 할당

    }


}


public class Exercise_58 {


    public static void main(String[] args) {

    }
}
