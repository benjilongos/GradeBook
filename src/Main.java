import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
System.out.println("Hello! And welcome to the best grade book you could find around the globe! If you have any grades you want to calculate, you have come to the right place!");
System.out.println("Please enter grades between the values (1-100) and enter a negative value if you are finished or would like to restart.");
int totalCount = 0;
double sum = 0;
double highest = 0;
double lowest = 100;
double grade = 0;
while (grade>=0) {
	System.out.println("Enter grade: ");
	grade = in.nextDouble();
	
if (grade < 0) {
System.out.println("All done!");
	break;
}

if (grade<1||grade>100) {
	System.out.println("Please enter a valid value: ");
	grade = in.nextDouble();
} else {
	totalCount = totalCount + 1;
	sum = sum + grade;
}
if (grade > highest) {
highest = grade;
}
if (grade < lowest) {
lowest = grade;
}

if (totalCount > 0) {
double average = sum/totalCount;
System.out.println("The amount of grades entered was "+totalCount+" ");
System.out.println("Your overall average is "+average+" ");
System.out.println("Your highest grade is "+highest+" ");
System.out.println("Your lowest grade is "+lowest+" ");
System.out.println("Thank you for choosing me as your grade book! If you ever need more calculations, I'll be right here!");

}
}
	
	}

}
