interface Add{  
    int add(int a,int b);  
}  
interface Mul{  
    int mul(int a,int b);  
}  
interface Sub{  
    int sub(int a,int b);  
}  
interface Div{  
    int div(int a,int b);  
}  
public class Lambda {
	  public static void main(String[] args) {
			  
			        Add a=(x,y)->(x+y);
			        Div b=(c,d)->(c/d);
			        Mul c=(e,f)->(e*f);
			        Sub d=(g,h)->(g-h);
			        System.out.println(a.add(10,20)); 
			        System.out.println(d.sub(10,20));
			        System.out.println(c.mul(10,20));
			        System.out.println(b.div(10,20));

			    }  
			 
	  }

