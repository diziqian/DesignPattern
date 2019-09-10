
public class Test {
	static {
		System.out.println("静态匿名函数测试");
	}
	
	public static void main(String[] args) {
		RunSport iRunProxy = new RunProxy();
		iRunProxy.run();
	}

}
