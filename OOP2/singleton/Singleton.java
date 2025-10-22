package OOP2.singleton;

public class Singleton {
    int num;
    private Singleton(){
        
    }
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
