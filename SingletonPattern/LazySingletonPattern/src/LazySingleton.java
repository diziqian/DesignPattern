
public class LazySingleton {
	 private static final LazySingleton instance = new LazySingleton();
	 
	 private LazySingleton()
	 {		 		 
	 }
	 
	 public static LazySingleton getInstance()
	 {
		 return instance;
	 }
	 
	 public void getName()
	 {
		 System.out.println("¿¡∫∫ Ω£°£°£°");
	 } 

}
