package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        // a = count
        int a = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                a++;
            }
        }
        System.out.println(a);
        // tpel mejtexi simvolnery
        int i1 = chars.length / 2;
        int i2 = i1 - 1;
        System.out.println("MEJTEXI SIMVOLNERN EN  " + chars[i2] + " U " + chars[i1]);
        // tpel true ete masivy verjanum e ly-ov ete voch apa tpel false
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        System.out.println(chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l');
        //tpel ayn simvolnery voronq prabel chen
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (char value : text) {
            if (value != ' ') {
                System.out.print(value + " ");
            }
        }
    }
}
