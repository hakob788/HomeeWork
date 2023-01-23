package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int start = 0;
        int end = 0;
        int i = 0;
        while (i < spaceArray.length) {
            if (spaceArray[i] != ' ') {
                break;
            }
            start++;
            i++;
        }
        {
            int j = spaceArray.length - 1;
            while (j > 0) {
                if (spaceArray[j] != ' ') {
                    break;
                }
                end++;
                j--;
            }
        }
        char[] result = new char[spaceArray.length - (start + end)];
        System.out.print("result ");

        for (int j = 0; j < result.length; j++) {
            result[j] = spaceArray[start++];
            System.out.print(result[j]);
        }
    }
}

