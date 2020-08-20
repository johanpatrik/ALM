import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Skriv in första talet");
            String first = scanner.nextLine();

            System.out.println("Skriv in andra talet");
            String second = scanner.nextLine();

            int firstAsInt = Integer.valueOf(first);
            int secondAsInt = Integer.valueOf(second);

            System.out.println("Välj räknesätt *, /, +, -");
            String arithmetic = scanner.nextLine();
            if(arithmetic.equals("*")){
                System.out.println(firstAsInt * secondAsInt);
            }else if(arithmetic.equals("/")) {
                System.out.println(firstAsInt / secondAsInt);
            }else if(arithmetic.equals("+")) {
                System.out.println(firstAsInt + secondAsInt);
            }else if (arithmetic.equals("-")) {
                System.out.println(firstAsInt - secondAsInt);
            }
            System.out.println("fixed conflict");
        }
    }
}