import java.util.Scanner;

public class CheckScoreMenu {
    private CheckScoreCtrl ctrl;

    public CheckScoreMenu(CheckScoreCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void display() {
        System.out.println("== Quiz Management System ==");
        System.out.println("1. Check student's score");
        System.out.println("2. Quit Application");
        System.out.print("Please enter your choice: ");
    }

    public void readOption() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            display();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkScore();
                    break;
                case 2:
                    System.out.println("bye bye");
                    break;
                default:
                    System.out.println("Enter a choice between 1 to 2");
            }
        } while (choice != 2);
    }

    public void checkScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student's name > ");
        String studentName = sc.nextLine();
        System.out.print("Enter the quiz name > ");
        String quizName = sc.nextLine();

        try {
            double retDiff = ctrl.calculateDifferenceFromAverage(studentName, quizName);
            if (retDiff == 0.0) {
                System.out.println(String.format("%s is sitting on the fence!%n", studentName));
            } else if (retDiff < 0.0) {
                System.out
                        .println(String.format("%s is %.1f marks below the average%n", studentName, Math.abs(retDiff)));
            } else {
                System.out.println(String.format("%s is %.1f marks above the average%n", studentName, retDiff));
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}