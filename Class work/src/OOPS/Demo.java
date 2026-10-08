package OOPS;

//class Student {
//    String name;
//    int age;
//    Student() {
//        this.name = "Unknown";
//        this.age = 0;
//    }
//    Student(String n) {
//        this.name = n;
//        this.age = 0;
//    }
//    Student(String n, int a) {
//        this.name = n;
//        this.age = a;
//    }
//}
class A{
    void dog(){
        System.out.println("This is Dog A");
    }
}
public class Demo extends A {
    void dog(){
        System.out.println("This is Dog B");
    }
    void display(){
        dog();
        super.dog();
    }
    public static void main(String[] args) {
        A d1 = new A();
        A a2 = new Demo();
        Demo d2 = new Demo();
        Demo b = new A();
        d1.dog();
//        Student s1 = new Student();
//        Student s2 = new Student("Rahul");
//        Student s3 = new Student("Rahul", 20);
//        System.out.println(s1.name + " " + s1.age);
//        System.out.println(s2.name + " " + s2.age);
//        System.out.println(s3.name + " " + s3.age);
    }
}

