package Abstract;

abstract class A{
    abstract void m1();
    abstract void m2();
}
class B extends A{
    void m1() {
        System.out.println("Hello");
    }
    void m2(){
        System.out.println("M2");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        B a1 = new B();
        a1.m1();
    }
}
