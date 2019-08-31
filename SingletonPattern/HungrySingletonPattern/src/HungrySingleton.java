
public class HungrySingleton {
	private static volatile HungrySingleton instance=null;    //保证 instance 在所有线程中同步
    
	//private 避免类在外部被实例化
	private HungrySingleton()
    {    	
    }    
	
	//JAVA中的synchronized的关键字就是好
    public static synchronized HungrySingleton getInstance()
    {
        //getInstance 方法前加同步
        if(instance==null)
        {
            instance=new HungrySingleton();
        }
        
        return instance;
    }
    
    public void getName()
    {
    	System.out.println("饿汉式！！！");
    }

}
