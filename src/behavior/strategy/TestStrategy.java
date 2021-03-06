package behavior.strategy;

import behavior.strategy.fly.FlyWithWings;
import behavior.strategy.quack.Squeak;

public class TestStrategy
{
	public static void main(String []args)
	{
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.display();
		mallard.swim();
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.performQuack();
		model.swim();
		
		model.setFly(new FlyWithWings());
		model.setQuack(new Squeak());
		
		System.out.println("...................................");
		model.performFly();
		model.performQuack();
		
	}

}
