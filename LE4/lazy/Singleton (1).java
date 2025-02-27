//Eager Solution
public class Singleton{
    private static Singleton uniqueInstance = new Singleton();
    private Singleton(){};
    public static Singleton getInstance(){
        System.out.println("Inside get Instance fn");
        return uniqueInstance;
    }
}