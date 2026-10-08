package pack2;
import OOPS.Demo;

class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}
class demo2 extends Animal {
    void sound() {
        System.out.println("Dog sound");
    }
    void display() {
        super.sound();
        this.sound();
    }
    public static void main(String[] args) {
        demo2 d = new demo2();
        d.display();
    }
}
