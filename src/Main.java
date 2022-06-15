import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat){
            System.out.println("Pleaying current song on repeat");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes.");
            String userInput = input.next();

            if(userInput.equals("yes")){
                    isOnRepeat = false;
            }

            System.out.println("playing next song");

        }

    }
}
