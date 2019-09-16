
public abstract class  Pen {
	protected IColor iColor;
	
	public Pen(IColor iColor) {
		this.iColor = iColor;
	}
	
	public void draw();
}
