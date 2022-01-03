package access_modifiers2;
import access_modifiers.StudentInfo; 
public class StudentAcademicData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo student1 = new StudentInfo();
		student1.setName("Elon Musk");
		student1.setSubjectName("Economics");
		student1.setGrade('A');

		System.out.println("Name:" + student1.getName() + "\n" + "Subject:" + student1.getSubjectName() + "\n"
				+ "Grade:" + student1.getGrade());

	}

}
