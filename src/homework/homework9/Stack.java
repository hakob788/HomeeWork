package homework.homework9;

public class Stack {
    private char[] array = new char[10];
    private int size;

    public Stack() {
        size = -1;
    }

    public char push(char value) {
        if (size == array.length) {
            System.out.println("stack-ը վերջացավ");
        } else {
            array[++size] = value;
        }
        return value;
    }

    public char pop() {
        if (size < 0) {
            System.out.println("stack-ը դատարկ է");
            return 0;
        } else {
            return array[size--];
        }
    }
}
