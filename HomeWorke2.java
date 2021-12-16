/**
 * Java 1. Homework #2
 * @author Hkilenko Evgeniy
 * @version 16.12.2021
 *
 */

class HomeWorke2 {
    public static void main(String[]args) {
        System.out.println(isInterval(10, -2));
        System.out.println(isInterval(12, -5));
        System.out.println(isInterval(20, -4));
        
        isPozitiveOrNegative(-1);
        isPozitiveOrNegative(0);
        isPozitiveOrNegative(1);
        
        System.out.println(isNegative(-1));
        System.out.println(isNegative(0));
        System.out.println(isNegative(1));
        
        repeatString("I NUB", 5);
    }

    static boolean isInterval(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void isPozitiveOrNegative(int a) {
        System.out.println(a >= 0 ? "Pozitiv" : "Negative"); 
    }

    static boolean isNegative(int a) {
        return a < 0;
        
    }

    static void repeatString(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
        
    }

}
