package homework.homework7;

public class Calculator {
    double plus(double a, double b) {
        return a + b;
    }

    double minus(double a, double b) {
        return a - b;
    }

    double divide(double a, double b) {
        if (b == 0){
            return -1;
        }
        return a / b;
    }
    double multiply(double a, double b){
        return a * b;
    }
}
