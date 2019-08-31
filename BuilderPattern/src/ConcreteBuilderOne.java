
public class ConcreteBuilderOne implements IBuilder {
	private Product product = new ProductA();
	
	public void buildA() {
		System.out.println("One A");
	}
	
	public void buildB() {
		System.out.println("One B");		
	}
	
	public Product retrieveProduct() {
		System.out.println("Retrive Product One");
		return product;
	}
}

