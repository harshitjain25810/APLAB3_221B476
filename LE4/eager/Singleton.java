//Lazy Solution
public class Singleton{
    private static Singleton uniqueInstance;
    private Singleton() {}
    public static Singleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance= new Singleton();
            System.out.println("if statement printed");}
        return uniqueInstance;
    }
}