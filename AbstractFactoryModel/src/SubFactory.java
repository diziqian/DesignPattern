
public class SubFactory  extends AbstractFactory {
	@Override
	public IOperation CreateOperation() {
		System.out.println("����������");
		return new SubOperation();
	}
	
	@Override
	public IDraw CreateDraw() {
		return null;
	}
	
}