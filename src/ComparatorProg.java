import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
	String name;
	int roll;
	int age;
	public Student(int roll, String name, int age) {
	this.age=age;
	this.name=name;
	this.roll=roll;
	}
}

class ComparatorSortByName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return s1.name.compareTo(s2.name); //if first string has bigger size return 1 else return -1 and if equal size return 0
	}
	
}

class ComparatorSortByAge implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.age>s2.age) {
			return 1;
		}
		else if(s1.age<s2.age) {
			return -1;
		}
		return 0;
	}
}

class ComparatorProg{
	public static void main(String args[]) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(106,"jay",27));  
		al.add(new Student(105,"Jai",21)); 
		Collections.sort(al, new ComparatorSortByName());
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Student sus=(Student)itr.next();
			System.out.println(sus.name + sus.age + sus.roll);
		}
		
	}

}