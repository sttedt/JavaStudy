package ch09;

public class Car_Main {
	static void driver(Car r) {
		r.move(100, 10);
		r.stop();
	}
	
	public static void main(String[] args) {
		Car_pride p = new Car_pride();
		driver(p);
		Car_Ray r = new Car_Ray();
		driver(r);
	}
}
