
import java.text.FieldPosition;

/*
import java.util.*;
public class inheritance{
    class a{
        String name="parent";
        int marks=100;
    }
    class b extends a{
        String name="child of a";
        int marks=90;
    }
    public static void main(String[] args) {
        inheritance s1=new inheritance();
        inheritance.a obj1=s1.new a ();
        inheritance.b obj2=s1.new b ();
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}*/


/*
public class inheritance {

    static class a {
        String name = "parent";
    }

    static class b extends a {
        String name = "child of a";
    }

    public static void main(String[] args) {

        inheritance.a obj1 = new inheritance.a();
        inheritance.b obj2 = new inheritance.b();

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
*/

/*

Case 1: The variable is static
class A {
    static String name = "Parent";
}

public class Main {
    public static void main(String[] args) {
        System.out.println(A.name);
    }
}


Output:
Parent


Here, name is static, so you can access it using the class name: A.name.

You can also access it through an object, but using the class name is preferred.
Case 2: The inner class is static
public class inheritance {

    static class A {
        String name = "Parent";
    }

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.name);
    }
}


Output:
Parent

*/

/*
//single inheritance

class a{
    String name="vel";
    int mark=100;
}
class b extends a{
    String name="murugan";
}
public class inheritance{
    public static void main(String[] args) {
        b obj=new b();
        System.out.println(obj.name);
        System.out.println(obj.mark);
    }
}
*/

/*
class a {
    String name = "vel";
    int mark = 100;
}

class b extends a {
    String name = "murugan";

    void display() {
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(mark);
    }
}
public class inheritance{
    public static void main(String[] args) {
        b obj=new b();
        //System.out.println(obj.name);
        //System.out.println(obj.mark);
        obj.display();
    }
}

*/


/*
//multilevel inheritance
class a{
    String name="parent";
    int mark=100;
}
class b extends a{
    String name="child of a";
}
class c extends b{
    String name="child of b";
}
public class inheritance{
    public static void main(String[] args) {
        c obj=new c();
        //System.out.println(obj.name);
        //System.out.println(obj.mark);
        System.out.println(obj.name);
        System.out.println(obj.mark);
    }
}

*/

/*
//multiple inheritance using interface
interface a{
    void greet();
    
}
interface b{
    void thank();
}
class c implements a,b{
    public void greet(){
        System.out.println("hello");
    }
    public void thank(){
        System.out.println("thanks");
    }
}
public class inheritance{
    public static void main(String[] args) {
        c obj=new c();
        obj.greet();
        obj.thank();
    }
}

*/

/*

2. Interface — can it contain normal methods?
An interface cannot declare an ordinary instance method with a body like a typical class method. However, it can provide implementations through default, static, and private methods.
interface Animal {

    void sound(); // Abstract method

    default void sleep() { // Method with implementation
        System.out.println("Animal is sleeping");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}


Output:
Dog barks
Animal is sleeping

*/


/*
//hierarchical inheritance

class a{
    String name="parent";
    int mark=100;
    int id=123;
}
class b extends a{
    String name="child1";
    int mark=90;
    int id=12;
}
class c extends a{
    String name="child2";
    int mark=99;
}

public class inheritance{
    public static void main(String[] args) {
        c obj=new c();
        System.out.println(obj.name);
        System.out.println(obj.id);
    }
}
*/

/*
//hybrid inheritance
Single + Multilevel = Hybrid inheritance, if combined into one structure.



Hierarchical + Multiple = Hybrid inheritance, if combined into one structure.



Single + Hierarchical = Hybrid inheritance, if combined into one structure.

*/
/*
class a{
    String name="parent";
    int id=1;
}
class b extends a{
    String name="child of a";
    int id=2;
}
class c extends b{
    String name="child of b";
    int id=3;
}
interface d{
    void greet();
}
interface e{
    void thank();
}

class f extends c implements d,e{
    public void greet(){
        System.out.println("hi");
    }
    public void thank(){
        System.out.println("thanks");
    }
}
class g extends f{
    //int id=90;
}
public class inheritance{
    public static void main(String[] args) {
        g obj=new g();
        obj.greet();
        System.out.println(obj.id);
    }
}
*/


/*
//abstract method for multiple inheritance
abstract class a{
    abstract void greet();
    void thank(){
        System.out.println("Thanks");
    }
}
abstract class c{
    
}
class b extends a{
    public void greet(){
        System.out.println("hello");
    }
}

public class inheritance{
    public static void main(String[] args) {
        b obj=new b();
        obj.greet();
        obj.thank();
    }
}
*/

/*
//polymorphism

//complie time polymorphism
public class inheritance{
    public static void main(String[] args) {
        add(2,3);
        add(2,3,4);
    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
*/
/*
//run time polymorphism
class a{
    void greet(){
        System.out.println("Hello");
    }
}
class b extends a{
    void greet(){
        System.out.println("Hello vel");
    }
}
public class inheritance{
    public static void main(String[] args) {
        b obj=new b();
        obj.greet();
    }
}

*/