
public class SubFactory  extends AbstractFactory {
	@Override
	public IOperation CreateOperation() {
		System.out.println("创建减法类");
		return new SubOperation();
	}
	
	@Override
	public IDraw CreateDraw() {
		return null;
	}
	
}