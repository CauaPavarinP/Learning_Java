import java.util.Scanner;

public class ThirdJavaExercise {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type the first number:");
        int firtsnumber = scanner.nextInt();

        System.out.println("type the second number:");
        int secondnumber = scanner.nextInt();

        System.out.println("Choose one of the optins:");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        System.out.println("0 - exit");
        int OptionChosen = scanner.nextInt();

        Integer  result = switch(OptionChosen) {
            case 1 -> (firtsnumber + secondnumber);
            case 2 -> firtsnumber - secondnumber;
            case 3 -> firtsnumber * secondnumber;
            case 4 -> {
                if (secondnumber == 0){
                    System.out.println("It is not possible to divide by 0.");
                    yield null;
                } 
                yield firtsnumber / secondnumber;
            }
            case 0 -> {
                if (OptionChosen == 0){
                    System.out.println("You chose to leave");
                }
                yield null;
            }
            default -> {
                System.out.println("invalid option");
                yield null;
            }
        };

        if (result != null) {
            System.out.println("The result is " + result);
        }

        scanner.close();
    }
}
