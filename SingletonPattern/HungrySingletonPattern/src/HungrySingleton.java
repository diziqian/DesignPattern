
public class HungrySingleton {
	private static volatile HungrySingleton instance=null;    //��֤ instance �������߳���ͬ��
    
	//private ���������ⲿ��ʵ����
	private HungrySingleton()
    {    	
    }    
	
	//JAVA�е�synchronized�Ĺؼ��־��Ǻ�
    public static synchronized HungrySingleton getInstance()
    {
        //getInstance ����ǰ��ͬ��
        if(instance==null)
        {
            instance=new HungrySingleton();
        }
        
        return instance;
    }
    
    public void getName()
    {
    	System.out.println("����ʽ������");
    }

}
