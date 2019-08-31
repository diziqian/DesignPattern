
public class ConcreteBuilderTwo implements IBuilder  {
	private Product product = new ProductB();
	
	public void buildA() {
		System.out.println("Two A");
	}
	
	public void buildB() {
		System.out.println("Two B");
	}
	
	public Product retrieveProduct() {
		System.out.println("Retrieve Product Two!!!");
		return product;
	}
}
