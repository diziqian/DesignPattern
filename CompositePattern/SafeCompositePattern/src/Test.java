
public class Test {
	public static void main(String[] args) {
		Composite root = new Composite("C盘");
		
		Composite workDir = new Composite("工作");
		
		Composite picDir = new Composite("图片");
		Leaf iLeaf1 = new Leaf("美女1.jpg");
		Leaf iLeaf2 = new Leaf("美女2.jpg");
		
		picDir.add(iLeaf1);
		picDir.add(iLeaf2);
		
		root.add(workDir);
		root.add(picDir);
		root.printStruct("root");
	}

}
