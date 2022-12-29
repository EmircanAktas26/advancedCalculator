import java.util.Scanner;

/*
 *@Author Emircan Aktaş - 29.Dec.2022
 */
public class Main {
    static void sum() {
        Scanner inp = new Scanner(System.in);
        int counter, number, result = 0;
        System.out.print("How many numbers will you enter :");
        counter = inp.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = inp.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result += number;
        }
        System.out.println("Answer :" + result);
    }

    static void subtraction() {
        Scanner inp = new Scanner(System.in);
        int counter, number, result = 0;
        System.out.print("How many numbers will you enter :");
        counter = inp.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = inp.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Answer :" + result);
    }

    static void multiplication() {
        Scanner inp = new Scanner(System.in);
        int counter, number, result = 0;
        System.out.print("How many numbers will you enter :");
        counter = inp.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = inp.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result *= number;
        }
        System.out.println("Answer :" + result);
    }

    static void division() {
        Scanner inp = new Scanner(System.in);
        int counter, number, result = 0;
        System.out.print("How many numbers will you enter :");
        counter = inp.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = inp.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            if (number == 0){
                System.out.println("Error! Wrong value.");
                return;
            }
            result /= number;
        }
        System.out.println("Answer :" + result);
    }

    static void exponent() {
        Scanner inp = new Scanner(System.in);
        double base, pow, result;

        System.out.print("Enter the base number :");
        base = inp.nextInt();

        System.out.print("Enter the pow number :");
        pow = inp.nextInt();

        result = Math.pow(base, pow);
        System.out.println("Answer :" + result);
    }

    static void factorial() {
        Scanner inp = new Scanner(System.in);
        int number, result = 1;

        System.out.print("Enter the number :");
        number = inp.nextInt();

        for (int i = number; i >= 1; i--) {
            result *= i;
        }

        System.out.println("Answer :" + result);
    }

    static void mod() {
        Scanner inp = new Scanner(System.in);
        int number1, number2, remainder;

        System.out.print("Enter the first number :");
        number1 = inp.nextInt();
        System.out.print("Enter the second number :");
        number2 = inp.nextInt();

        remainder = number1 % number2;
        System.out.println("Answer :" + remainder);
    }

    static void rectArea() {
        Scanner inp = new Scanner(System.in);
        int a,b,area = 0;

        System.out.print("Enter the length in meter: ");
        a = inp.nextInt();

        System.out.print("Enter the width in meter: ");
        b = inp.nextInt();

        area = a * b;
        System.out.println("Answer :" + area);
    }

    static void rectPerimeter() {
        Scanner inp = new Scanner(System.in);
        int a,b,perimeter = 0;

        System.out.print("Enter the base in meter: ");
        a = inp.nextInt();

        System.out.print("Enter the height in meter: ");
        b = inp.nextInt();

        perimeter = (a+b)*2;
        System.out.println("Answer :" + perimeter);
    }




    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1-Sum\n" +
                "2-Subtraction\n" +
                "3-Multiplication\n" +
                "4-Division\n" +
                "5-Exponentiation\n" +
                "6-Factorial\n" +
                "7-Modulo\n" +
                "8-Rectangle -> {\n" +
                "0-Quit";

        do {
            System.out.println("********************************************");
            System.out.println(menu);
            System.out.print("Please select an action :");
            select = inp.nextInt();

            switch (select) {
                case 1 -> sum();
                case 2 -> subtraction();
                case 3 -> multiplication();
                case 4 -> division();
                case 5 -> exponent();
                case 6 -> factorial();
                case 7 -> mod();
                case 8 -> {
                    System.out.println("" +
                            "1-For the area of rectangle\n" +
                            "2-For the perimeter of rectangle\n" +
                            "Select the operation (1,2) :");
                    select = inp.nextInt();
                    if (select == 1) {
                        rectArea();
                    } else if (select == 2) {
                        rectPerimeter();
                    } else {
                        System.out.println("Wrong selection!");
                    }

                }
                case 0 -> System.out.println("See you again...");
                default -> System.out.println("Wrong selection! Try again.");
            }

        } while (select != 0);
    }
}