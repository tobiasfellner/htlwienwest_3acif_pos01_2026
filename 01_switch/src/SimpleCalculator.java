import java.util.Scanner;

public class SimpleCalculator {
    /*
        1. Benutzer abfragen um Zahl a und Zahl b
        2. Benutzer abfragen um Operator (String)
        3. neue Methode calc(int, int, String)
           - Berechnung mit switch lösen
        4. in main aufrufen und Ergebnis ausgeben
            - Bei / und b=0 Fehlermeldung ausgeben
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl a eingeben:");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Zahl b eingeben:");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Operator eingeben:");
        String op = scanner.nextLine();

        if(b == 0 && op.equals("/")){
            System.out.println("Ungültige Eingabe: DIV durch 0");
        }else{
            double result = calc(a, b, op);
            System.out.printf("Das Ergebnis von %d %s %d = %.2f", a, op, b, result);
        }

        scanner.close();
    }

    public static double calc(double a, double b, String operator){
        double result = switch (operator){
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            case "*" -> a * b;
            default -> Double.NaN;
        };
        return result;
    }

    public static double calcLong(double a, double b, String operator){
        double result;

        switch (operator){
            case "+":
                result = a + b;
                break;

            case "-":
                result = a - b;
                break;

            case "/":
                result = a / b;
                break;

            case "*":
                result = a * b;
                break;
            default:
                System.out.println("ungültig");
                result = Double.NaN;
        }
        return result;
    }
}
