import java.util.ArrayList;
import java.util.List;

public class ConcatenateLists {

    public static List<Integer> concatenateLists(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            throw new IllegalArgumentException("Lists cannot be null");
        }

        List<Integer> concatenatedList = new ArrayList<>(list1);
        concatenatedList.addAll(list2);
        return concatenatedList;
    }

    public static void main(String[] args) {
        
        List<Integer> numbers1 = List.of(1, 2, 3);
        List<Integer> numbers2 = List.of(4, 5, 6);

       
        List<Integer> concatenated = concatenateLists(numbers1, numbers2);
        System.out.println("Concatenated list: " + concatenated);
    }
}
