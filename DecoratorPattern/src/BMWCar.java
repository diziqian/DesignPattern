
public class BMWCar implements IDecorator {
	@Override
	public void run() {
		System.out.println("You run on the BMWCar");
		beRich();
	}
	
	private void beRich() {
		System.out.println("You are rich!!!");
	}

}
