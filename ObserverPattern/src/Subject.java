import java.util.ArrayList;
import java.util.List;
 
public class Subject implements ISubject{
	private List<IObserver> observers;
	private String strMsg;
	
	public Subject(List<IObserver> observers) {
		this.observers = observers;
	}
	
	@Override
	public void registerObserver(IObserver o) {
		observers.add(o);
	}
	
	@Override
	public void deregisterObserver(IObserver o) {
		observers.remove(o);
	}
	
	@Override
	public void notifyObserver() {
		for(IObserver o:this.observers) {
			o.update(strMsg);
		}
	}
	
	public void setMessage(String strMsg) {
		this.strMsg = strMsg;
		System.out.println("主题者更新消息如下: " + strMsg);
		
		notifyObserver();
	}
}
