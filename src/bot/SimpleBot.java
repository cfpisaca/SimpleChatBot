package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Francesco", "2022");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String yourName = scanner.nextLine();
        System.out.printf("What a great name you have, %s!", yourName);
        System.out.println();
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int yourAge = ((scanner.nextInt() * 70) + (scanner.nextInt() * 21) + (scanner.nextInt() * 15)) % 105;

        System.out.printf("Your age is %s; that's a good time to start programming!", yourAge);
        System.out.println();
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int countTo = scanner.nextInt();

        for (int i = 0; i <= countTo; i++) {
            System.out.println(i + "!");
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int answer = scanner.nextInt();

        for (int i = answer; i != 4; i = scanner.nextInt()) {
            System.out.println("Please, try again.");
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}

