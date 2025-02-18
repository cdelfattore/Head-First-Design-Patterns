package Chapter_1;

public abstract class Duck
{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() { }

    public void performFly()
    {
        this.flyBehavior.fly();
    }

    public void performQuack()
    {
        this.quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior)
    {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior)
    {
        this.quackBehavior = quackBehavior;
    }

    public void swim()
    {
        System.out.println("All ducks float, even decoys!");
    }
}