

public class TestLazySinleton {

	public static void main(String[] args) {
		LazySingleton lazySingletonA = LazySingleton.getInstance();
		LazySingleton lazySingletonB = LazySingleton.getInstance();
		
		if(lazySingletonA == lazySingletonB)
		{
			System.out.println("��һʵ��");
		}
		else 
		{
			System.out.println("�ǵ�һʵ��");
		}
		
		lazySingletonA.getName();
	}

}
