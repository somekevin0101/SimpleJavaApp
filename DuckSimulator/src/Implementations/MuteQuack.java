package Implementations;
import Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<<Silence>>");
	}
}
