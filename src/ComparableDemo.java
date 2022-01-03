import java.util.*;
public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cars> al=new ArrayList<Cars>();    
		al.add(new Cars(100,"Tesla",10));    
		al.add(new Cars(1234,"Toyota",2));    
		al.add(new Cars(10,"Hundai",1));    
		    
		Collections.sort(al);    
		for(Cars c:al){    
		System.out.println(" Car name:"+c.name+"\n Cars age:"+c.age+"\n Mileage:"+c.mileage);    
		}    
	}

}
