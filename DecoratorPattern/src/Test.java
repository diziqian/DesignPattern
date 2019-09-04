
public class Test {
	public static void main(String[] args) {
		IDecorator iDecoratorBMW = new BMWCar();
		iDecoratorBMW.run();
		
		IDecorator iDecoratorBench = new BenchCar();
		iDecoratorBench.run();
	}
}