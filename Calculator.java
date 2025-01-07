
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");

    }
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }
    
    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if(b==0)return 0;
        return (double) a / b;
    }

}
