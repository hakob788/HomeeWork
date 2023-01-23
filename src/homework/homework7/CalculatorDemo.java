package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator cl = new Calculator();

        System.out.println(cl.plus(12,24));
        System.out.println(cl.minus(24,12));
        System.out.println(cl.divide(12,24));
        System.out.println(cl.multiply(24,12));
    }
}
