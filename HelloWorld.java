/**
 * Java 1. Homework #1
 * @author Hkilenko Evgeniy
 * @version 11.12.2021
 *
 */

class HelloWorld {
    public static void main(String[]args) {
        printThreeWords();
        checkSumSign();
        printColor();
        ompareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = -50;
        int b = 30;
        System.out.println((a + b >= 0) ? "sum is pozitiv" : "sum is negotiv");

    }

    static void printColor() {
        int value = 105;
        if (value < 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
    }

    static void ompareNumbers() {
        int a = 6;
        int b = 5;
        System.out.println((a >= b) ? "a >= b" : "a < b");

        
    }

}
