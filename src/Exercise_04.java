
class C {}
class CS extends C {}
interface I {}
class CI extends C implements I {}


public class Exercise_04 {


    static I i = new CI();
    static C ca = new CI();
//    static CS cs = new C(); // 자손 타입 변수에 부모 타입 객체를 대입할수 없다.
    static C cb = new CS();



}
