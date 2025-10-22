package OOP2.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        obj.num=10;
        Singleton obj2=Singleton.getInstance();
        obj2.num=20;
        System.out.println(obj.num);
    }
}
