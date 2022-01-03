import java.util.ArrayList;
import java.util.Arrays;

class parameters{  
static ArrayList<Integer> two(int a,int b)
{
	return new ArrayList<Integer>(Arrays. asList((Integer)a, (Integer)b));
	}  //ArrayList<Integer> numbers = new ArrayList<>(Arrays. asList(1, 2, 3, 4, 5, 6));
static ArrayList<Integer> three(int a,int b,int c){
	return new ArrayList<Integer>(Arrays. asList((Integer)a, (Integer)b, (Integer)c) );
	}  
static ArrayList<Integer> four(int a,int b,int c, int d){
	return new ArrayList<Integer>(Arrays. asList((Integer)a, (Integer)b, (Integer)c, (Integer)d) );
	}  
}  // Integer intobject = new Integer(68);
//Integer.parseInt(i.toString())
class Overloading{  
public static void main(String[] args){  
System.out.println(parameters.two(1,2));  
System.out.println(parameters.three(1,2,3));  
System.out.println(parameters.four(1,2,3,4));  
}}  