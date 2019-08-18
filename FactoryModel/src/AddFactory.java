
public class AddFactory  implements IFactory {
	@Override
	public IOperation CreateOperation()
	{
		System.out.println("创建加法类");
		return new AddOperatio();
	}
}
