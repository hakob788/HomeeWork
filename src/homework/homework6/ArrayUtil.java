package homework.homework6;

public class ArrayUtil {
    void allElement() {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30,};
        for (int j : array) {
            System.out.print(j + " | ");
        }
    }

    void largeElementsint() {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30,};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
    }
    void smallElements() {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30,};
        int min = array[0];
        for (int i = 1; i > array.length; i++)
            if (array[i] < min) {
                min = array[i];
            }
        System.out.println("min = " + min);
    }
}
