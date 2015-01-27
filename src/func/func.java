package func;

public class func {
	static boolean condition(){
		boolean result = Math.random() < 128;
		System.out.print(result +",");
		return result;
	}
	public static void main(String[] args) {
	while (condition())
		System.out.println("Inside while ");
	System.out.println("Exited while ");
	

	}

}
