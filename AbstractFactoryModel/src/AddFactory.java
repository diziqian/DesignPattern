
public class AddFactory  extends AbstractFactory {
	@Override
	public IOperation CreateOperation()
	{
		System.out.println("创建加法类");
		return new AddOperatio();
	}
	
	@Override 
	public IDraw CreateDraw()
	{
		return null;
	}
	
}
