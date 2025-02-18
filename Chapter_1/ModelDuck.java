package Chapter_1;

public class ModelDuck extends Duck
{
    public ModelDuck()
    {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Quack();
    }

    public void display()
    {
        System.out.println("I'm a model duck");
    }
}
