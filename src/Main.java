import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
System.out.println("Hello! And welcome to the grade book! If you have any grades you want to calculate, you have come to the right place!");
System.out.println("Please enter the grades (1-100) and enter -1 if you want to stop.");
System.out.println("Enter grade: ");
int grade = in.nextInt();
while (grade<=100) {
	System.out.println("Enter grade: ");
	grade = in.nextInt();
	
if (grade>100) {
	System.out.println("Too high, try again");
}

	if (grade==-1) {
	System.out.println("All done!");
	

}


}
	
	}

}
