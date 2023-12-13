public class LoopWithoutBreak {

   	 public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean earlyExit = false;

        for (int number : numbers) {
            if (number == 5) {
                earlyExit = true;
            }

            if (!earlyExit) {
               
                System.out.println(number);
            } else {
                
                System.out.println("Exiting loop early due to 'break' condition");
                
                break;
            }
        }
    }
}