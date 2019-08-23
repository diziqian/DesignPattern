
public class TestHungrySingleton {
	public static void main(String[] args)
    {
		HungrySingleton hgSingleton1 = HungrySingleton.getInstance();
		hgSingleton1.getName();    //输出总统的名字
		HungrySingleton hgSingleton2 = HungrySingleton.getInstance();;
		hgSingleton2.getName();    //输出总统的名字
        if(hgSingleton1 == hgSingleton2)
        {
           System.out.println("他们是同一人！");
        }
        else
        {
           System.out.println("他们不是同一人！");
        }
    }

}
