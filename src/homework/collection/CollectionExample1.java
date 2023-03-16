package homework.collection;

import java.util.Scanner;
import java.util.ArrayList;

public class CollectionExample1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Asqyar");
        names.add("Petros");
        names.add("Poxos");
        names.add("Martiros");
        names.add("Artavazd");
        //1
        System.out.println("Please input name");
        String name = scanner.nextLine();
        if (names.contains(name)) {
            System.out.println("the name is on the list!");
        } else {
            System.out.println("name not listed!");
        }
        //2
        System.out.println("Please input delete name ");
        String deleteName = scanner.nextLine();
        if (names.remove(deleteName)) {
            System.out.println(names);
        } else {
            System.out.println("name not listed!");
        }
        //3
        System.out.println("Please input name");
        String addName = scanner.nextLine();
        System.out.println("Please input index ");
        int index = scanner.nextInt();
        if (index >= 0 && index <= names.size()) {
            names.add(index, addName);
            System.out.println(names);
        } else {
            System.out.println("wrong index!");
        }
    }
}