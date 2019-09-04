
public class BenchCar implements IDecorator {
	@Override
	public void run() {
		System.out.println("You run on the BenchCar");
		beRoyal();
	}
	
	private void beRoyal() {
		System.out.println("You are royal!!!");
	}

}
