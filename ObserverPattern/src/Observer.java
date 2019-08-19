public class Observer implements IObserver{
	private String strName;
	private String strMsg;
	
	public Observer(String strName) {
		this.strName = strName;
	}
	
	@Override
	public void update(String strMsg) {
		this.strMsg = strMsg;
		read();
	}
 
	public void read() {
		System.out.println(strName + " ���յ����͵���Ϣ: " + strMsg);
	}

}