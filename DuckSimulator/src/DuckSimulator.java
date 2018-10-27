import Implementations.FlyOnARocket;
import Models.DecoyDuck;
import Models.Duck;
import Models.MallardDuck;

public class DuckSimulator {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.display();
		
		Duck decoy = new DecoyDuck();
		decoy.performQuack();
		decoy.performFly();
		decoy.display();
		decoy.setFlyBehavior(new FlyOnARocket());
		decoy.performFly();
	}

}
