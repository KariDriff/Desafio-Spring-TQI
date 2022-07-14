package base.strategy;

public class AgressiveBehaviour implements Behaviour {
	@Override
	public void move() {
		System.out.println("Movendo-se agressivamente...");
	}
}