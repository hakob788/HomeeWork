package homework.collection;

import java.util.*;

public class CollectionExample2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //1
        Set<String> names = new HashSet<String>();
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " name: ");
            String name = scanner.nextLine();
            names.add(name);
        }
        System.out.println("without repetition");
        for (String name : names) {
            System.out.println(name);
        }
        //2
        TreeSet<String> sortNames = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " name: ");
            String sortName = scanner.nextLine();
            sortNames.add(sortName);
        }
        System.out.println("Sorted names");
        for (String sortName : sortNames) {
            System.out.println(sortName);
        }
    }
}



