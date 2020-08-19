import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Skriv in första talet");
            int first = scanner.nextInt();

            System.out.println("Skriv in andra talet");
            int second = scanner.nextInt();

            System.out.println("Välj räknesätt *, /, +, -");
            String arithmetic = scanner.nextLine();
            if(arithmetic == "*"){
                System.out.println("first ** second");
            }
            if(arithmetic.equals("-")){
                System.out.println("first - second");
            }
            if(arithmetic.equals("/")){
                System.out.println("first / second");
            }
        }

    }
}
