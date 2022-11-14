# positive.java
    import java.util.Scanner;

    public class Switch {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a weeksday number :");

            int weeksday = scanner.nextInt();

            switch (weeksday) {
                case 1:
                    System.out.println("sunday");
                    break;
                case 2:
                    System.out.println("monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("friday");
                    break;
                case 7:
                    System.out.println("saturday");
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }

