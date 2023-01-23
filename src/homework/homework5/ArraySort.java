package homework.homework5;

public class ArraySort {
    public static void main(String[] args) {

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int value = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = value;
                }
            }
        }
        System.out.print("poqric mec : ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int value = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = value;
                }
            }
        }
        System.out.print("mecic poqr : ");
        for (int number : numbers) {
            System.out.print(number + " ");

        }
        System.out.println();

    }
}

