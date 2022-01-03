class CloningProg implements Cloneable{  
int rollno;  
String name;  
  
CloningProg(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
  
public static void main(String args[]){  
try{  
CloningProg s1=new CloningProg(1,"Jay");  
  
CloningProg s2=(CloningProg)s1.clone();  
  
System.out.println(s1.rollno+" "+s1.name);  
System.out.println(s2.rollno+" "+s2.name);  
  
}catch(CloneNotSupportedException c){}  
  
}  
}  

