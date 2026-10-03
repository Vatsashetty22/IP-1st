3import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        switch (marks) 
        {
            case 1 :(marks>=90)
                System.out.println("O");
                break;

            case 2 :(marks>=80)
                System.out.println("A+");
                break;

            case 3 :
                System.out.println("A");
                break;

            case 4 :
                System.out.println("B+");
                break;

            case 5 :
                System.out.println("B+");
                break;

            case 6 :
                System.out.println("C+");
                break;

            default:
                System.out.println("Fail");
        }
        sc.close();
    }
}