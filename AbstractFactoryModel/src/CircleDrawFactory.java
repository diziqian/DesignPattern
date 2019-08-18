
public class CircleDrawFactory extends AbstractFactory {
	@Override
	public IOperation CreateOperation()	{
		return null;
	}
	
	@Override
	public  IDraw CreateDraw() {
		return new CircleDrawOperation();
	}
}
