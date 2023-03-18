package technical;

public class StudentCaller {

	public static void main(String[] args) {

		// details of student one
		// TakeMarks();
		Student s1 = new Student();
		// Grade of Student 1
		s1.TakeMarks();
		System.out.print("Grade of Student 1 is : ");
		s1.Grade();
		// details of student one
		Student s2 = new Student();
		s2.TakeMarks();
		// Grade of Student 2
		System.out.print("Grade of Student 2 is : ");
		s2.Grade();
	}

}
