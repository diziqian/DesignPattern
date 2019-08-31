
public class Test {
	public static void main(String[] args) {
		AbstractFactory iAddFactory = new AddFactory();
		IOperation iAdd = iAddFactory.CreateOperation();
		System.out.println(iAdd.operate(1.0, 2));
		
		AbstractFactory iSubFactory = new SubFactory();
		IOperation iSub = iSubFactory.CreateOperation();
		System.out.println(iSub.operate(1.0, 2));
		
		AbstractFactory iDrawFactory = new CircleDrawFactory();
		IDraw iDraw = iDrawFactory.CreateDraw();
		iDraw.draw();
		
		iDrawFactory = new ColorDrawFactory();
		IDraw iColor = iDrawFactory.CreateDraw();
		iColor.draw();
	}

}
