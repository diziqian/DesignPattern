
public class AddFactory  implements IFactory {
	@Override
	public IOperation CreateOperation()
	{
		System.out.println("�����ӷ���");
		return new AddOperatio();
	}
}
