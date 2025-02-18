package Chapter_1;

public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        super.quackBehavior = new Quack();
        super.flyBehavior = new FlyWithWings();
    }

    public void display()
    {
        System.out.println("I'm a real Mallard duck");
    }
}
