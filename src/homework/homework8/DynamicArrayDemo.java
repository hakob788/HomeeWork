package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.print();
        System.out.println();
        System.out.println();
        System.out.println(da.getByIndex(7));
        System.out.println();
        da.deleteByIndex(7);
        System.out.println();
        da.set(7,9);
        da.print();
        System.out.println();
        System.out.println();
        da.add(7, 9);
        da.print();
        System.out.println();
        System.out.println();
        System.out.println(da.exists(7));
        System.out.println();
        System.out.println(da.getIndexByValue(7));
    }
}
