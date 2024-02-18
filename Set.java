import java.util.ArrayList;

    public class Set {
        private ArrayList<Integer> elements;

        public Set() {
            elements = new ArrayList<>();
        }

        public void add(int element) {
            if (!elements.contains(element)) {
                elements.add(element);
            }
        }

        public void remove(int element) {
            elements.remove(Integer.valueOf(element));
        }

        public boolean contains(int element) {
            return elements.contains(element);
        }

        public int size() {
            return elements.size();
        }

        public ArrayList<Integer> toList() {
            return elements;
        }

        public static void main(String[] args) {
            testSet();
        }

        public static void testSet() {
            testAddingElements();
            testRemovingElements();
            testContainsElement();
            testSizeAfterRemoval();
        }

        public static void testAddingElements() {
            Set mySet = new Set();
            mySet.add(1);
            mySet.add(2);
            mySet.add(3);
            mySet.add(2);
            System.out.println("Set: " + mySet.toList());
            System.out.println("Size: " + mySet.size());
        }

        public static void testRemovingElements() {
            Set mySet = new Set();
            mySet.add(1);
            mySet.add(2);
            mySet.add(3);
            mySet.remove(2);
            System.out.println("Set after removing 2: " + mySet.toList());
        }

        public static void testContainsElement() {
            Set mySet = new Set();
            mySet.add(1);
            mySet.add(2);
            mySet.add(3);
            System.out.println("Contains 2? " + mySet.contains(2));
        }

        public static void testSizeAfterRemoval() {
            Set mySet = new Set();
            mySet.add(1);
            mySet.add(2);
            mySet.add(3);
            mySet.remove(2);
            System.out.println("Size after removal: " + mySet.size());
        }
    }

