
abstract class Person
{
    void sleep()
    {
        System.out.println("sleeping");
    }
    void play()
    {
        System.out.println("playing");
    }
    abstract void study();
}
class Afeef extends Person
{
    public void study()
    {
        System.out.println("studying");
    }
    public void eat()
    {
        System.out.println("eating");
    }
}
public class Exp17 {
    public static void main(String args[]){
        Afeef a = new Afeef();
        a.sleep();
        a.eat();
        a.play();
        a.study();
    }
}