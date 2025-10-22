package OOP2;

// Initialising static variables
public class StaticBlock {
    static int a=4;
    static int b;
    int c=10;
    // run once when 1st object is created: when class is loaded for the first time
    static{
        System.out.println("I am in static block!");
        b=a*5;
    }
    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        // System.out.println(obj.a+" "+obj.b);
        System.out.println(StaticBlock.a+" "+StaticBlock.b+" "+obj.c);
        StaticBlock.b+=3;
        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b+" "+obj.c);
    }
}
