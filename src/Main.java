import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        String studentFirstName = "Kayla";
        String studentLastName = "Hammon";


        System.out.println(studentFirstName + " " + studentLastName + " is " + studentAge +  " years old and has a GPA of " + studentGPA);

        System.out.println("What do you want the students GPA to be updated to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName +  " NOW has a GPA of " + studentGPA);



    }
}
