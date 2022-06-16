import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time ");
        System.out.println("type a random word and press enter to start dev tea time ");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time ");
    }

    public static void main(String[] args) {
       //Calling the function
        announceDeveloperTeaTime();
        //randome code
        System.out.println("code");
        //Calling the function again to show you can use it multiple times
        announceDeveloperTeaTime();
    }
}