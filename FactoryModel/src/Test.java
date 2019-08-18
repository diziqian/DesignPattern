
public class Test {
	public static void main(String[] args) {
		IFactory iAddFactory = new AddFactory(); 
		IOperation iAdd = iAddFactory.CreateOperation();
		
		IFactory iSubFactory = new SubFactory(); 
		IOperation iSub = iSubFactory.CreateOperation();
		
		System.out.println(iAdd.operate(1.0, 2));
		System.out.println(iSub.operate(1.0, 2));
	}

}
