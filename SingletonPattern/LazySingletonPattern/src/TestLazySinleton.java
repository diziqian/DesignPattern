

public class TestLazySinleton {

	public static void main(String[] args) {
		LazySingleton lazySingletonA = LazySingleton.getInstance();
		LazySingleton lazySingletonB = LazySingleton.getInstance();
		
		if(lazySingletonA == lazySingletonB)
		{
			System.out.println("单一实例");
		}
		else 
		{
			System.out.println("非单一实例");
		}
		
		lazySingletonA.getName();
	}

}
