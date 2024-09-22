
import java.util.Scanner;

public class Soal3 {
    public void main(String[] args){
        char operator;
        int number1, number2, result = 0;        

        try (Scanner scan = new Scanner(System.in)) {
            
            
            number1 = scan.nextInt();
            operator = scan.next().charAt(0);
            number2 = scan.nextInt();

            switch (operator) {
                case '+' -> result = number1 + number2;
                case '-' -> result = number1 - number2;
                case '*' -> result = number1 * number2;
                case '/' -> result = number1 / number2;
                case '%' -> result = number1 % number2;
                default -> {
                    System.out.println("Operator yang diinputkan harus +, -, *, /, atau %");
                }
            }
                
            System.out.println(number1 + " " +  operator + " " + number2 + " = " + result);
        }
    }
}


