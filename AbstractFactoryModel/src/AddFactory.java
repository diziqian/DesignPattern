
public class AddFactory  extends AbstractFactory {
	@Override
	public IOperation CreateOperation()
	{
		System.out.println("�����ӷ���");
		return new AddOperatio();
	}
	
	@Override 
	public IDraw CreateDraw()
	{
		return null;
	}
	
}
