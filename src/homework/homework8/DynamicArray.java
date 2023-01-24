package homework.homework8;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("սխալ ինդեքս");
            return -1;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println(index + "-րդ էլեմենտ չկա");
        }
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }

        size--;
    }

    public void set(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.out.println(index + "-րդ էլեմենտ չկա");
        }
        array[index] = value;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.out.println(index + "-րդ էլեմենտ չկա");
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    public boolean exists(int value) {
        for (int i = 0; i <= size - 1; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i <= size - 1; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
