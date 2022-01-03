
public class StaticDemo {

	static int static_variable= 10;
	
	static {
		
		System.out.println("Insdie the static Block...");
		
	}
	
	static void static_method()
	{
		System.out.println("Static Method invoked....");
	}
	
	public static void main(String[] args) {
		
		System.out.println("calling static_variable: "+static_variable);
		System.out.println("calling static method..");
		StaticDemo.static_method();
	}
}