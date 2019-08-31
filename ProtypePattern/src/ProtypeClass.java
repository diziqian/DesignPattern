
public class ProtypeClass implements Cloneable {
	private String strName;
	private String strGender;
	private String strCareer;
	
	public void setName(String strName) {
		this.strName = strName;
	}
	
	public void setGender(String strGender) {
		this.strGender = strGender;
	}
	
	public void setCareer(String strCareer) {
		this.strCareer = strCareer;
	}
	
	@Override
	protected ProtypeClass clone() {
		ProtypeClass protypeClone = null;
		
		try {
			protypeClone  = (ProtypeClass)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return protypeClone;
	}
	
	@Override
	public String toString() {
		return "Protype" +
			"\tName:\t" +
				strName +
				"\tGender:\t" +
				strGender +
				"\tCareer:\t" +
				strCareer;
	}

}
