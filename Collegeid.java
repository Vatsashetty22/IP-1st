import java.util.Scanner;

class College {

    // Private variables - Encapsulation
    private String studentName;
    private String collegeId;
    private String phoneNumber;
    private int marks;

    // Getter and Setter for studentName
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter and Setter for collegeId
    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    // Getter and Setter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter for marks
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("College ID: " + collegeId);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Marks: " + marks);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating object
        College student = new College();

        // Taking input
        System.out.print("Enter Student Name: ");
        student.setStudentName(sc.nextLine());

        System.out.print("Enter College ID: ");
        student.setCollegeId(sc.nextLine());

        System.out.print("Enter Phone Number: ");
        student.setPhoneNumber(sc.nextLine());

        System.out.print("Enter Marks: ");
        student.setMarks(sc.nextInt());

        // Displaying details
        student.displayDetails();

        sc.close();
    }
}