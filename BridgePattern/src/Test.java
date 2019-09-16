
public class Test {
	public static void main(String[] args) {
		Pen penA = new SmallPen(new RedColor());
		penA.draw();
		
		Pen penB = new BigPen(new YellowColor());
		penB.draw();
	}
}
