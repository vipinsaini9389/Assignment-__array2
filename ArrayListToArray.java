// Write a Java program to convert an ArrayList to an array.
import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        Integer[] array = new Integer[arrayList.size()];
        array = arrayList.toArray(array);

        System.out.println("ArrayList: " + arrayList);
        System.out.print("Array: ");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
