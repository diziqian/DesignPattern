
public interface ISubject {
	public void registerObserver(IObserver o);
	public void deregisterObserver(IObserver o);
	public void notifyObserver();
}
