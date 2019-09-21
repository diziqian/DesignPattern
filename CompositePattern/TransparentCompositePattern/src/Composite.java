import java.util.*;

public class Composite implements IComponent {
	String strName;
	
	List<IComponent> lstChild = new ArrayList<>();
	
	Composite(String strName){
		this.strName = strName;
	}
	
	
	
	@Override
	public void add(IComponent iComponent) {
		lstChild.add(iComponent);
	}
	
	@Override
	public void remove(IComponent iComponent) {
		lstChild.remove(iComponent);
	}
	
	@Override
	public void displayPre(String strPre) {
		System.out.println(strPre+ " "+ this.strName);
		strPre += " " + this.strName;
		
		if(lstChild != null) {
			for(IComponent child: lstChild) {
				child.displayPre(strPre);
			}
		}
	}

}
