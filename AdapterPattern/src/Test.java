
public class Test {
	public static void main(String[] args) {
		IAdapter iAdapter = new Adapter();
		
		AC110V ac100VTest = new AC110V();
		iAdapter.transferOutput(ac100VTest);
		
		AC200V ac200VTest = new AC200V();
		iAdapter.transferOutput(ac200VTest);
	}

}
