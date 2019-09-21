import java.util.*;


public class Composite implements IComponent {
	String strName;
	
	List<IComponent> lstChild = new ArrayList<IComponent>();
	
	public Composite(String strName) {
		this.strName = strName;
	}
	
	@Override
	public void printStruct(String strPre) {
		System.out.println(strPre + this.strName);
		strPre += " ";
		
		if(this.lstChild != null) {
			for(IComponent child: lstChild) {
				child.printStruct(strPre);
			}
		}
	}
	
	public void add(IComponent iComponent) {
		lstChild.add(iComponent);
	}
	
	public void remove(IComponent iComponent) {
		lstChild.remove(iComponent);
	}
	
	//public void display();

}
