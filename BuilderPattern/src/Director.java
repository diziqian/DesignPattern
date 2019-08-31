
public class Director {
	private IBuilder builder;
	
	public void construct(String type) {
		if (("one").equals(type)){
			builder = new ConcreteBuilderOne();
			builder.buildA();
			builder.buildB();
			builder.retrieveProduct();			
		} else if(("two").equals(type)) {
			builder = new ConcreteBuilderTwo();
			builder.buildA();
			builder.buildB();
			builder.retrieveProduct();	
		}
	}

}
