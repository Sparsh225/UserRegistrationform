package technical;
//S O L I D

//D -DRY--> Donot Repeat Yourself

class StudentDetails {
	// default Scope
	int rollno;
	public String name;
	double fees;

	public void ShowDetails() {

		System.out.println("RollNumber : " + rollno);
		System.out.println("Name : " + name);
		System.out.println("Fees : " + fees);
	}

	public void takeinput(int rollno, String name, double fees) {
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}
}

public class studentt {

	public static void main(String[] args) {
		StudentDetails ram = new StudentDetails();
		/*
		 * ram.rollNo = 101; ram.name = "Ram"; ram.fees = 1000;
		 */

		ram.ShowDetails();

		// if we execute this below line only not writeing the above command default
		// values will be printed
		/*
		 * System.out.println("RollNumber : " + ram.rollNo);
		 * System.out.println("Name : " + ram.name); System.out.println("Fees : " +
		 * ram.fees);
		 */

		StudentDetails sham = new StudentDetails();
		/*
		 * sham.rollNo = 102; sham.name = "sham"; sham.fees = 4500;
		 */
		sham.ShowDetails();

		/*
		 * System.out.println("RollNumber : " + sham.rollNo);
		 * System.out.println("Name : " + sham.name); System.out.println("Fees : " +
		 * sham.fees);
		 */
	}

}
