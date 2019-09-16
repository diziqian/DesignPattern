
public class BigPen extends Pen {
	public BigPen(IColor iColor) {
		super(iColor);
	}
	
	@Override
	public void draw() {
		System.out.println("Big Pen Draw!!!");
		iColor.paint();
	}
}
