public class Main {

    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("Starr", "Phillips", "Baddie", 3.45, 2022);
        StudentProfile profileTwo = new StudentProfile("Serenity", "Puff", "Computer Science", 3.99, 2042);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);
    }

}