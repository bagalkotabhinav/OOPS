package OOP2;
import static OOP2.packages.a.A.message;
import static OOP2.packages.b.B.message2;
public class Main {
    public static void main(String[] args) {
        A obj=new A("abhi");
        System.out.println(obj);
        message();
        message2();
        Human abhi=new Human(23,"Abhinav",12,false);
        System.out.println(Human.population);
        Human ram=new Human(25,"Ram",20,true);
        System.out.println(Human.population);
        System.out.println(abhi.population);
        System.out.println(ram.population);
        Main obj2=new Main();
        obj2.greetings();
        Greetings();
    }
    void greetings(){
        // Greetings();
        System.out.println("Hello!");
    }
    static void Greetings(){
        // greetings();
        Main obj=new Main();
        obj.greetings();
        System.out.println("Hello all!");
    }
}

class Student{
    int rno;
    String name;
    float marks;
    Student(){
        // this.rno=1;
        // this.name="Ram";
        // this.marks=100.0f;
        this(1,"Ram",100.0f);
    }
    Student(int rno, String name, float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    Student(Student other){
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }
    void greeting(){
        System.out.println("Hello I am " + this.name);
    }
    static void greetings(){
        // System.out.println(this.rno);
        System.out.println("Helloooo!");
    }
}

class A{
    final int a=10;
    String name;
    A(){}
    A(String name){
        this.name=name;
    }
    // @Override
    // protected void finalize() throws Throwable {
    //     System.out.println("Finalizing object for " + name);
    // }
}