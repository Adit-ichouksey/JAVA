
// public class lec9 {
// public static void main(String[] args) {
//     String str = "hello";
//     Sum();
// }
// static void Sum() {
//  System.out.println("hello");
//   }
// }
//
// class Car {
//     public void Sum() {
//         System.out.println("uff java");
//     }
// }
// public class lec9 {
//     public static void main(String[] args) {
//         Car obj = new Car();
//         obj.Sum();
//    }
// }
//
// class Car {
//     int a;
//     Car(int a) {
//         // a=b;
//         //  a=a;
//         this.a = a;
//     }
// }
// public class lec9 {
//     public static void main(String[] args) {
//         Car obj = new Car(5);
//         System.out.println(obj.a);
//     }
// }
//
// class Student {
//     String name;
//     int rollNumber;
//     double marks;
//     void display() {
//         System.out.println("Name" + " " + name);
//         System.out.println("rollNumber" + " " + rollNumber);
//         System.out.println("marks" + " " + marks);
//     }
// }
// public class lec9 {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "om";
//         s1.rollNumber = 155;
//         s1.marks = 96.0;
//         Student s2 = new Student();
//         s2.name = "ram";
//         s2.rollNumber = 101;
//         s2.marks = 96.0;
//         s1.display();
//         s2.display();
//     }
// }
//
// class Car{
//     int a;
//     String name;
//     Car(int a,String name){
//         this.a=a;
//         this.name=name;
//         System.out.println("name"+ " "+name);
//         System.out.println("a"+ " "+a);
//     }
// }
// public class lec9{
//     public static void main(String[] args) {
//         Car c1=new Car(10,"BMW");
//         Car c2=new Car(20,"Audi");   
//     }
// }
//
// public class lec9 {
// class Parent {
//     int x = 10;
//     Parent() {
//         System.out.println("Parent constructor: x = " + x);
//     }
// }
// class Child extends Parent {
//     int x = 20;
//     Child() {
//         System.out.println("Child this.x = " + this.x);
//         System.out.println("Child super.x = " + super.x);
//     }
//     void show() {
//         int x = 30;
//         System.out.println("local x = " + x);
//         System.out.println("this.x = " + this.x);
//         System.out.println("super.x = " + super.x);
//     }
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.show();
//     }
// }
//
// class Hello {
//     public Hello() {
//         this(5);
//         System.out.println("hiii");
//     }
//     public Hello(int a) {
//         this(5, 6);
//         System.out.println(a);
//     }
//     public Hello(int a, int b) {
//         System.out.println(a);
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Hello obj = new Hello();
//     }
// }
// }
//
