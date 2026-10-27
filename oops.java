//FUNCTION-outside the class block of code is called as function
//METHODS-inside the class block of code is called as methods
//in java we only have methods


/* METHOD IMPLEMENTATION
import java.util.*;
public class oops{
    public static void main(String args[]){
        add();
        System.out.println("add function executed sucessfullt");
    }
    public static void add(){
        int a=2;
        int b=4;
        int c=a+b;
        System.out.println(c);
    }
}
*/

/*RECURSION -A function which calls itself is called as recursion

//printing natural number from 1 to n
import java.util.*;
public class oops{
    public static void main(String args[]){
        nprint(1,10);
    }
    public static void nprint(int n,int k){
        if(n>k){
            return;
        }
        System.out.println(n);
        nprint(n+1,k);
    }

}

*/

/* CLASS AND OBJECT

1. Procedural Programming
You write a program as a sequence of procedures/functions.
Main idea:  
“What steps should the computer follow?”
Example languages:
- C
- Pascal
- Fortran
int add(int a, int b) {
    return a + b;
}
Think of it like a recipe: step 1 → step 2 → step 3.


2. Object-Oriented Programming (OOP)
Programs are organized around objects and classes.
Main idea:  
“What objects exist, and what should they do?”
Example languages:
- Java
- C++
- C#
- Python
- JavaScript
Java example:
class Car {
    String color;

    void drive() {
        System.out.println("Car is driving");
    }
}
Important OOP concepts:
- Class
- Object
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction


CLASS-class is a template or blueprint(like a container)
ex:school application form,which  is same for everyone
object-object is an instance of a class
ex:i can fill the form using my information so object is an instance of a class

IMPLEMENTATION:
implementation for class and object


import java.util.*;
public class oops{
    String name;
    int rollno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public static void main(String[] args) {
        oops s1=new oops();
        s1.name="velmurugan";
        s1.rollno=123;
        s1.display();
        //you can create multiple object
    }
}

*/

/*
import java.util.*;
class demo{
    String name;
    int rollno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }  
    public void setvalues(String name,int num){
        this.name=name;//without using this u will get previous value because 
        //You have two things called name 
        //Java chooses the local parameter when you simply assign previous value
        rollno=num;
    } 
}
public class oops{
    public static void main(String[] args) {
        demo s1=new demo();
        s1.name="velmurugan";
        s1.rollno=1234;
        s1.display();
        s1.name="vel";
        s1.display();
        demo obj2=new demo();
        obj2.name="vk";
        obj2.rollno=321;
        obj2.display();
        obj2.setvalues("murugan", 44);
        obj2.display();
    }
}

*/

/*
//ACCESS MODIFIER


import java.util.*;
class demo{
    private String name;
    int rollno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }  
    public void setvalues(String name,int num){
        this.name=name;//without using this u will get previous value because 
        //You have two things called name 
        //Java chooses the local parameter when you simply assign previous value
        rollno=num;
    } 
    public  String getvalues(){
        return name;
    }
}
public class oops{
    public static void main(String[] args) {
        demo obj2=new demo();
        //obj2.name="vk";//if u declare as private string name in that class u cannot  access the name from here,it can only accessible by that block
        obj2.setvalues("ram", 100);//you can access the public function that can set the value ,that wont give error
        //String namm=obj2.name;//it gives error because name is declared as private
        String nam=obj2.getvalues();//this can give the name even it is private
        System.out.println(nam);
        // obj2.rollno=321;
        // obj2.display();
        // obj2.setvalues("murugan", 44);
        // obj2.display();
    }
}

| Modifier    | Same Class | Same Package | Subclass (Other Package) | Other Package |
|-------------|------------|--------------|--------------------------|---------------|
| `private`   | ✅        | ❌           | ❌                      | ❌            |
| **default** | ✅        | ✅           | ❌                      | ❌            |
| `protected` | ✅        | ✅           | ✅                      | ❌            |
| `public`    | ✅        | ✅           | ✅                      | ✅            |
*/

/*
\\CONSTRUCTOR
Constructor rules
A constructor:
1. Has the same name as the class
2. Has no return type
3. Runs automatically when an object is created
4. Is used mainly for object initialization
5. Can be overloaded
6. Is not inherited

import java.util.*;
class demo{
    String name;
    int marks;
    public demo(){
        System.out.println("This is a default constructor");
        name="vel";
        marks=100;
    }
}
public class oops{
    public static void main(String[] args) {
        demo obj=new demo();
        System.out.println(obj.name);
        System.out.println(obj.marks);
        
    }
}

*/


/*
//ENCAPSULATION

ENCAPSULATION-Encapsulation is the process of wrapping data 
and methods together inside a class and restricting direct 
access to the data.

private variables
public getter and setter methods

Encapsulation = Data hiding + Controlled access

Real-life example:
An ATM hides the internal banking operations. 
You interact through buttons and the screen rather 
than directly accessing the bank's database.
*/

/*ABSTRACTION
ABSTRACTION-Abstraction is the process of hiding implementation
 details and showing only the essential features to the user.

 How do we achieve it?
Mainly using:
- abstract class
- interface

Abstraction = Hiding implementation details + Showing essential features

What is the difference?", say:
Encapsulation hides and protects the data by controlling access to it, 
whereas abstraction hides the implementation details and 
exposes only the essential functionality.

*/

/*
import java.util.*;
abstract class computer{
    public static void turnon(){
        System.out.println("turning on");
    }
    public static void turnoff(){
        System.out.println("turning on");
    }
    abstract void buy();//you can just declare here what u want
    //you can overwrite and use in extended class when u want
}

class hp extends computer{
    public static void turnoff(){
        System.out.println("turning off");//overwrite the previous function
    }
    void buy(){
        System.out.println("declared things overwrited");
    }
}
public class oops{
    public static void main(String[] args) {
        hp obj=new hp();
        //we cannot create an object directly to an abstract class
        obj.turnon();
        obj.turnoff();
        obj.buy();
    }
}

*/


/*
If child is also abstract, implementation is NOT mandatory
abstract class Animal {
    abstract void sound();
}

abstract class Dog extends Animal {
    
}
*/