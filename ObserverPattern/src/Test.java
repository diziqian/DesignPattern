import java.util.ArrayList;
import java.util.List;
 
 
public class Test {
	public static void main(String[] args) {
        //这里需要模拟一个主题者，多个观察者
 
        //观察者
		IObserver cus01  = new Observer("body01");
		IObserver cus02  = new Observer("body02");
		IObserver cus03  = new Observer("body03");
 
        
        List<IObserver> observers = new ArrayList<IObserver>();
        observers.add(cus01);
        observers.add(cus02);
        observers.add(cus03);
 
        //主题者
        Subject subsject = new Subject(observers);
        
        //更新了消息之后，会自动通知消费者
        subsject.setMessage("message01 ---这是人性的扭曲还是道德的沦丧");
        System.out.println("cus01 取消关注公众号");
        observers.remove(cus01);
        subsject.setMessage("message02 ---震惊，一群男女光天化日下尽然干这事......");
    }
 
 
}
