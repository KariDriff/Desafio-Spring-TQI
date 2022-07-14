package base;

import base.facade.Facade;
import base.singleton.SingletonEager;
import base.singleton.SingletonLazy;
import base.singleton.SingletonLazyHolder;
import base.strategy.AgressiveBehaviour;
import base.strategy.Behaviour;
import base.strategy.DefensiveBehaviour;
import base.strategy.NormalBehaviour;
import base.strategy.Robot;

public class Test {
	public static void main(String[] args) {

		// Singleton

		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);

		// Strategy

		Behaviour defensive = new DefensiveBehaviour();
		Behaviour normal = new NormalBehaviour();
		Behaviour agressive = new AgressiveBehaviour();

		Robot robot = new Robot();
		robot.setBehaviour(normal);
		robot.move();
		robot.move();
		robot.setBehaviour(defensive);
		robot.move();
		robot.setBehaviour(agressive);
		robot.move();
		robot.move();
		robot.move();

		// Facade

		Facade facade = new Facade();
		facade.migrateClient("Kaio", "45416000");
	}
}