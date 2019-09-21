public class Leaf implements IComponent {
	String strName;
	
	public Leaf(String strName) {
		this.strName = strName;
	}
	
	@Override
	public void add(IComponent iComponent) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void remove(IComponent iComponent) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void displayPre(String strPre) {
		System.out.println(strPre + "——" + this.strName);
	}
	
}