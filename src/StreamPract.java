import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Employee{
	public String name;
	public int eid;
	public double salary;

	
	public Employee(Object eid, Object name, double salary){
		this.eid=(int) eid;
		this.name=(String) name;
		this.salary=salary;
	}
	
}


public class StreamPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Employee> emp = new ArrayList<Employee>(); 
		
        emp.add(new Employee(1, "Jeff Bezos", 100000.0));
        emp.add(new Employee(2, "Bill Gates", 200000.0));
        emp.add(new Employee(3, "Mark Zuckerberg", 300000.0));
        emp.add(new Employee(4, "Elon", 200000.0));
        emp.add( new Employee(5, "Jay", 3020000.0));
        emp.add(new Employee(6, "Avinash", 2000400.0));
        emp.add(new Employee(7, "Kush", 3003000.0));
        emp.add( new Employee(8, "DJ", 200000.0));
        emp.add(new Employee(9, "Person1", 30002.0));
        emp.add(new Employee(10, "Person2", 200000.0));
        List<String> salMoreThanTenLakh =emp.stream()  
                .filter(e -> e.salary > 1000000)// filtering data  
                .map(e->e.name)        // fetching price  
                .collect(Collectors.toList()); // collecting as list  
System.out.println(salMoreThanTenLakh);  
	}
	
}
