
public class TestHungrySingleton {
	public static void main(String[] args)
    {
		HungrySingleton hgSingleton1 = HungrySingleton.getInstance();
		hgSingleton1.getName();    //�����ͳ������
		HungrySingleton hgSingleton2 = HungrySingleton.getInstance();;
		hgSingleton2.getName();    //�����ͳ������
        if(hgSingleton1 == hgSingleton2)
        {
           System.out.println("������ͬһ�ˣ�");
        }
        else
        {
           System.out.println("���ǲ���ͬһ�ˣ�");
        }
    }

}
