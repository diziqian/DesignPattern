
public class SubFactory  implements IFactory {
	@Override
	public IOperation CreateOperation()
	{
		System.out.println("����������");
		return new SubOperation();
	}
}