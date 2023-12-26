import java.util.ArrayList;
import java.util.List;

public class EvenPositionElements {
    public static List<Integer> getEvenPositionElements(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        List<Integer> evenPositionElements = new ArrayList<>();
        
        for (int i = 1; i < list.size(); i += 2) {
            evenPositionElements.add(list.get(i));
        }

        return evenPositionElements;
    }

    public static void main(String[] args) {
       
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

   
        List<Integer> evenElements = getEvenPositionElements(numbers);
        System.out.println("Elements at even positions: " + evenElements);
    }
}
