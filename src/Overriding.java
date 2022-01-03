class EngineV12{   
  boolean run(boolean status){System.out.println("Engine initiate");
  return status;
  }  
}
  
   
class Hypersport extends EngineV12{   
  boolean run(boolean status){
	  System.out.println("Acccelerate");
	  return status;
  }  
  
} 
  
 
  class Overriding{
  public static void main(String args[]){  
  Hypersport obj = new Hypersport();
  System.out.println(obj.run(true));
  EngineV12 v12=new EngineV12();
  System.out.println(v12.run(false));
//  run();
  }  
}  