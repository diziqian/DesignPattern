
public class Test {
	static public void main(String[] args) {
		IComponent root = new Composite("D:");
		IComponent workDir = new Composite("work");
		IComponent picDir = new Composite("pic");
		
		Leaf lf1 = new Leaf("美女1.png");
		Leaf lf2 = new Leaf("美女2.png");
		
		//lf1.add(lf2);
		
		picDir.add(lf1);
		picDir.add(lf2);
		
		root.add(workDir);
		root.add(picDir);
		
		root.displayPre("");
	}
	
}
