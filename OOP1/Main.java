public class Main {
    public static void main(String[] args) {
        final Student abhi=new Student();
        Student abhinav=abhi;
        // abhi=abhinav;
        abhi.name="random";
        abhi.name="abhi";
        System.out.println(abhi.name);
        System.out.println(abhinav.name);
        int a=10;
        final Integer b=20;
        System.out.println(a);
        System.out.println(b);
        final int INCREASE=3;
        // INCREASE=4;
        System.out.println(INCREASE);
        // b=30;
        final A obj=new A("Abhi");
        // obj.a=30;
        // obj=new A("Abhinav");
        System.out.println(obj.name);
        // A obj1=new A();
        // for(int i=0;i<1000000000;i++)
        //     obj1=new A();
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
}

class A{
    final int a=10;
    String name;
    A(){}
    A(String name){
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing object for " + name);
    }
}