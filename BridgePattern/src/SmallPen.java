
public class SmallPen extends Pen{
	public SmallPen(IColor iColor) {
		super(iColor);
	}
	
	@Override
	public void draw() {
		System.out.println("Small Pen Draw!!!");
		iColor.paint();
	}
}
