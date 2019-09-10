
public class RunProxy implements RunSport {
	@Override
	public void run() {
		System.out.println("Proxy Run");
		warmUp();
		runner.run();
		stretch();
	}
	
	private void warmUp() {
		System.out.println("Warm up before running!!!");
		
	}
	
	private void stretch() {
		System.out.println("Stretch after running!!!");
	}
	
	private Runner runner = new Runner();
}
