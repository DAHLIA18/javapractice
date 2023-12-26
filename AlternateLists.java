import java.util.ArrayList;
import java.util.List;

public class AlternateLists {
    public static List<Integer> alternateLists(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            throw new IllegalArgumentException("Lists cannot be null");
        }

        List<Integer> combinedList = new ArrayList<>();
        int index = 0;
        int size = Math.max(list1.size(), list2.size());

        while (index < size) {
            if (index < list1.size()) {
                combinedList.add(list1.get(index));
            }
            if (index < list2.size()) {
                combinedList.add(list2.get(index));
            }
            index++;
        }

        return combinedList;
    }

    public static void main(String[] args) {
        
        List<Integer> numbers1 = List.of(1, 3, 5);
        List<Integer> numbers2 = List.of(2, 4, 6, 8);

      
        List<Integer> combined = alternateLists(numbers1, numbers2);
        System.out.println("Combined list: " + combined);
    }
}
