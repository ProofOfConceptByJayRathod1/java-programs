class EncapTest {
   private String name;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }


   public void setAge( int theirAge) {
      age = theirAge;
   }

   public void setName(String theirName) {
      name = theirName;
   }

}


public class Encapsulation {

	   public static void main(String args[]) {
	      EncapTest encap = new EncapTest();
	      encap.setName("Jay");
	      encap.setAge(20);
	      System.out.print("I am " + encap.getName() + " and I am " + encap.getAge());
	   }
	}