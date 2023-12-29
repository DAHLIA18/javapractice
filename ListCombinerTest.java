import org.junit.Test;
import static org.junit.Assert.*;

public class ListCombinerTest {

    @Test
    public void testListCombination() {
        List<Object> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<Object> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        List<Object> expectedCombinedList = new ArrayList<>();
        expectedCombinedList.add("a");
        expectedCombinedList.add(1);
        expectedCombinedList.add("b");
        expectedCombinedList.add(2);
        expectedCombinedList.add("c");
        expectedCombinedList.add(3);

        assertEquals(expectedCombinedList, ListCombiner.combineLists(list1, list2));

        List<Object> emptyList = new ArrayList<>();
        assertEquals(list2, ListCombiner.combineLists(emptyList, list2));
        assertEquals(list1, ListCombiner.combineLists(list1, emptyList));

        List<Object> singleItemList = new ArrayList<>();
        singleItemList.add("single");
        List<Object> singleItemList2 = new ArrayList<>();
        singleItemList2.add("item");
        assertEquals(singleItemList, ListCombiner.combineLists(singleItemList, emptyList));
        assertEquals(singleItemList2, ListCombiner.combineLists(emptyList, singleItemList2));
    }
}
