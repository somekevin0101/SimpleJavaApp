package Models;

import Implementations.FlyNoWay;
import Implementations.MuteQuack;


public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
	    flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I'm a little tricky, not a real duck");		
	}

}
