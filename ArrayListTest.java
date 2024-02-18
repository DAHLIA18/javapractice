import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        testIsEmpty();
        testAdd();
        testAddAll();
        testClear();
        testContains();
        testContainsAll();
        testIterator();
        testRemove();
        testRemoveAll();
        testRetainAll();
        testSize();
        testToArray();
        testToList();
    }

    public static void testIsEmpty() {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Is list empty? " + list.isEmpty()); 
    }

    public static void testAdd() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        System.out.println("List after adding element: " + list);
    }

    public static void testAddAll() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> otherList = new ArrayList<>(Arrays.asList(1, 2, 3));
        list.addAll(otherList);
        System.out.println("List after adding all elements from other list: " + list);
    }

    public static void testClear() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        list.clear();
        System.out.println("List after clearing: " + list);
    }

    public static void testContains() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
        System.out.println("Does list contain 'banana'? " + list.contains("banana"));
    }

    public static void testContainsAll() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
        ArrayList<String> otherList = new ArrayList<>(Arrays.asList("banana", "orange"));
        System.out.println("Does list contain all elements from other list? " + list.containsAll(otherList));
    }

    public static void testIterator() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.print("Iterating through the list: ");
        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void testRemove() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        list.remove(Integer.valueOf(2));
        System.out.println("List after removing element: " + list);
    }

    public static void testRemoveAll() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> otherList = new ArrayList<>(Arrays.asList(2, 4));
        list.removeAll(otherList);
        System.out.println("List after removing all elements from other list: " + list);
    }

    public static void testRetainAll() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> otherList = new ArrayList<>(Arrays.asList(2, 4));
        list.retainAll(otherList);
        System.out.println("List after retaining only elements from other list: " + list);
    }

    public static void testSize() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("Size of list: " + list.size());
    }

    public static void testToArray() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Object[] array = list.toArray();
        System.out.println("Array representation of list: " + Arrays.toString(array));
    }

    public static void testToList() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> copyList = new ArrayList<>(list);
        System.out.println("Copy of list: " + copyList);
    }
}