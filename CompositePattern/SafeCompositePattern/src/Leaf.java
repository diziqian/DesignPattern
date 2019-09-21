
public class Leaf implements IComponent {
	private String strName;
	
	public Leaf(String strName) {
		this.strName = strName;
	}

	@Override
	public void printStruct(String strPre) {
		System.out.println(strPre + "--" + this.strName);
	}
}
