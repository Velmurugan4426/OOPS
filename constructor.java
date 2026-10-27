/*
public class constructor{
    String name;
    int age;
    constructor(){
        name="unknow";
        age=20;
    }
    constructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("name: "+name+" "+"age: "+age);
    }
    public static void main(String[] args) {
        constructor obj=new constructor();
        constructor obj1=new constructor("vel",100);
        obj.display();
        obj1.display();
    }
}
*/

/*
//Constructor chaining using this()

public class constructor{
    constructor(){
        this("murugan");
        System.out.println("no arguments constructor");
    }
    constructor(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        constructor obj=new constructor();
    }
}
*/

class parent{
    parent(){
        System.out.println("i m parent constructor");
    }
}
class child extends parent{
    
    child(){
        super();
        System.out.println("This is child constructor");
    }
}
public class constructor{
    public static void main(String[] args) {
        child obj=new child();
    }
}