class V12{  
protected int model;
void category(){System.out.println("model:" +model + " check");}  
}  
class Engine extends V12{  
	Engine(int modelNo){
		model=modelNo;
	}
void gasoline(){System.out.println("engine on");}  
}  
class Inheritance{  
public static void main(String args[]){  
Engine car=new Engine(192);  
car.category();  
car.gasoline();  
}}  