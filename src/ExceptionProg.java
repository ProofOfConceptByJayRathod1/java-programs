

public class ExceptionProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int num1 = 15, num2 = 0, result = 0;
	      try{
	          result = num1/num2;
	          System.out.println("The result is" +result);
	      } 
	      catch (ArithmeticException e) {
	         System.out.println ("Can't be divided by Zero " + e);
	         System.out.println("Excepion ouccred from the arithmetic exception catch block.");
	      }
	      catch (Exception e) {
	          //This is a generic Exception handler which means it can handle all the exceptions.
	          System.out.println("Exception occurred from the generic catch block.");
	       }
	      finally {
			System.out.println("The finally block executes every time");
		}
	}

}
