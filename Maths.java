import java.util.Scanner;
public class Maths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter FirstNumber: ");
            double number1 = input.nextDouble(); // incase of decimal place result
        System.out.println("Enter SecondNumber: ");
            double number2 = input.nextDouble();
        
            Scanner input1 = new Scanner(System.in);

            System.out.println("Enter operator: ");
            String operator = input1.nextLine();

            switch (operator) { // 
                case "+":
                    double addition = number1 + number2;
                System.out.printf("Result: %s ", addition);
                break; // stop if + is the operator
                case "-":
                    double subtraction = number1 - number2;
                System.out.printf("Result: %s ", subtraction);
                break; // stop the process if - is the operator 
                case "/":
                    double division = number1 / number2;
                System.out.printf("Result: %s ", division);
                break; //stop the process if / is the operator
                case "*":
                    double multiplication = number1 * number2;
                System.out.printf("Result: %s ", multiplication);
                break; //stop the process if * is the operator
                case "%":
                    double modulus = number1 % number2;
                System.out.printf("Result: %s ", modulus);
                break; //stop the process if % is the operator
                case "^":
                        double powerT = 1;
                    for (double i=0; i<number2; i++){
                        powerT *= number1;
                }
                System.out.printf("Result: %s", powerT);
                break;
                default:
                System.out.println("Result:"+ " " + "error of operator"); // return error if operator is not recognised
        input1.close();
                input.close();    }
    } // end of class Maths
}