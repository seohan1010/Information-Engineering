interface InterfaceA{

    public void up();
    public void down();

}

class AB implements InterfaceA{

    int value = 0;
    public void up(){
        value++;
    }

    public void down(){
        value--;
    }

    void printValue(){
        System.out.println(value);
    }

    public static void main(String []args){
        AB ab = new AB();
        InterfaceA ia = ab;
        ia.up();
        ab.printValue();
    }



}



public class Exercise_32 {
}
