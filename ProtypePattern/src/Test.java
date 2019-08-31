
public class Test {
	public static void main(String[] args) {
		ProtypeClass protypeClass  = new ProtypeClass();
		int iNum = 10;
		
		while(iNum > 0) {
			ProtypeClass protypeInstance = protypeClass.clone();
			protypeInstance.setName("张三");
			protypeInstance.setGender("女");
			protypeInstance.setCareer("柜员");
			System.out.println(protypeInstance.toString());
			iNum--;
		}
	}
}
