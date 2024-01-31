
public class ArrayDescending {
    public static void main(String[] args) {
        int[] value = {7, 2, 8, 4, 10, 1, 6, 5};
        
       
        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[i] < value[j]) {
                    int temporary = value[i];
                    value[i] = value[j];
                    value[j] = temporary;
                }
            }
        }
        
       
        for (int number : value) {
            System.out.print(number + " ");
        }
    }
}