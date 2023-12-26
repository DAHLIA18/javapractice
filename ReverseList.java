public class ReverseList {

    public static void reverseList(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
      
        int[] numbers = {1, 2, 3, 4, 5};

        
        System.out.print("Original list: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

   
        reverseList(numbers);

       
        System.out.print("Reversed list: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
