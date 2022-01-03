import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeSet<String> al=new TreeSet<String>();  //soted unique values
		  al.add("Toyota");  
		  al.add("Tesla");  
		  al.add("Ford");  
		  al.add("Chervolet");  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();
		  System.out.println("soted unique values using treeset:");
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  
		   TreeMap<Integer,String> map=new TreeMap<Integer,String>();   //sorted key value pair 
		      map.put(1,"Tesla");    
		      map.put(100,"Hyundai");    
		      map.put(22,"Suzuki");    
		      map.put(103,"Tesla2");    
		      map.put(13,"Tesla3");    
			  System.out.println("soted unique key-values using treemap:");
		      for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
		      
		      HashSet<String> set=new HashSet();  //unique values only
	           set.add("Not");    
	           set.add("Sorted");    
	           set.add("in");   
	           set.add("HashSet");  
	           set.add("but");
	           set.add("TreeSet");
	           Iterator<String> i=set.iterator();
	 		  System.out.println("unique key-values using Hashset:");
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	           
	           
	           HashMap<Integer,String> hashmap=new HashMap<Integer,String>();//just key value pair  
	           hashmap.put(1,"Tesla");  //Put elements in Map  
	           hashmap.put(2,"Hyundai");    
	           hashmap.put(3,"Ford");   
	           hashmap.put(4,"MG"); 
	           hashmap.put(4,"1MG"); 
	 		  System.out.println("unique key-values using Hashmap:");
	           //System.out.println("Iterating Hashmap...");  
	           for(Map.Entry m : hashmap.entrySet()){    
	            System.out.println(m.getKey()+" "+m.getValue());    
	           }  
	}

}
