package homework.homework9;

public class Stack {
    private int[] array = new int[10];
    public int tos;

    public Stack() {
        tos = -1;
    }

    public void push(int value) {
        if (tos == 9) {
        } else {
            array[++tos] = value;
        }
    }

    public int pop() {
        if (tos < 0) {
            return 0;
        }
        return array[tos--];
    }
}
