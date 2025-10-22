package OOP2;

class InnerClass {
    class A{
        String name;
        A(String name){
            this.name=name;
        }
    }
    static class B{
        String name;
        B(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        // error because A is non static, hence an instance of parent class needed
        // A obj1=new A("Abhi");
        // can be created since B is a static class, not dependent on parent class
        B obj2=new B("Abhi");
        B obj3=new B("Abhinav");
        System.out.println(obj2.name);
        System.out.println(obj3.name);
    }
}
