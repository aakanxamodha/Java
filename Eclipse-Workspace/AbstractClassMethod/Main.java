package abstrct;

public class Main {

	public static void main(String[] args) {


		Vehicle v;			
		v = new Bike();
		v.start(); 
		v.stop();

		v = new Car();
		v.start(); 
		v.stop();
	}

}
