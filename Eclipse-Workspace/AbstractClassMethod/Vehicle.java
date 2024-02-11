/*Develop java code to demonstrate abstract class and abstract methods. */

package abstrct;

public abstract class Vehicle {

	abstract void start();
	abstract void stop();
	public void clean()
	{
		System.out.println("Vehicle.clean");
	}
}
