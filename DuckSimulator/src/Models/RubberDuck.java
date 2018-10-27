package Models;
import Implementations.FlyNoWay;
import Implementations.Squeak;;

public class RubberDuck extends Duck {
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I'm a real rubber ducky!");		
	}
	
	

}
