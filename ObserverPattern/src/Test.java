import java.util.ArrayList;
import java.util.List;
 
 
public class Test {
	public static void main(String[] args) {
        //������Ҫģ��һ�������ߣ�����۲���
 
        //�۲���
		IObserver cus01  = new Observer("body01");
		IObserver cus02  = new Observer("body02");
		IObserver cus03  = new Observer("body03");
 
        
        List<IObserver> observers = new ArrayList<IObserver>();
        observers.add(cus01);
        observers.add(cus02);
        observers.add(cus03);
 
        //������
        Subject subsject = new Subject(observers);
        
        //��������Ϣ֮�󣬻��Զ�֪ͨ������
        subsject.setMessage("message01 ---�������Ե�Ť�����ǵ��µ���ɥ");
        System.out.println("cus01 ȡ����ע���ں�");
        observers.remove(cus01);
        subsject.setMessage("message02 ---�𾪣�һȺ��Ů���컯���¾�Ȼ������......");
    }
 
 
}
