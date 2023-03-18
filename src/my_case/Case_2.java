package my_case;

public class Case_2 {

	public static void myMethod(String str) {
	    System.out.println(str.toLowerCase());  // java.lang.NullPointerException
	}
	
	public static void main(String[] args) {
	    String tempStr = null;
	    myMethod(tempStr);
	}
}
