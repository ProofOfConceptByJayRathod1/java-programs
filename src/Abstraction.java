interface Car {
	void engine();
	void seat();
}
class Vehicle implements Car {

	public void engine()
	{
		System.out.println("Engine Ignite");
	}
	public void seat()
	{
		System.out.println("seat belts on");
	}
}



// Driver code
public class Abstraction {
	public static void main(String[] args)
	{
		// New Vehicle object is created
		Vehicle CarPerson = new Vehicle();

		// Calls to the multiple functions
		CarPerson.engine();
		CarPerson.seat();
	}
}
