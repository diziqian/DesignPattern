
public class SubFactory  implements IFactory {
	@Override
	public IOperation CreateOperation()
	{
		System.out.println("创建减法类");
		return new SubOperation();
	}
}