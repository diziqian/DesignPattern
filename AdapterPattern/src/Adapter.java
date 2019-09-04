
public class Adapter implements IAdapter {
	private AC200V ac200V = new AC200V();
	private AC110V ac100V = new AC110V();
	
	@Override
	public void transferOutput(AC200V ac200V) {
		ac200V.outputEle();
		System.out.println("Transfer...");
		this.ac100V.outputEle();
		
	}
	
	@Override
	public void transferOutput(AC110V ac100V) {
		ac100V.outputEle();
		System.out.println("Transfer...");
		this.ac200V.outputEle();
	}

}
