public class TableSide {
    public static void main(String[] args) {

	for (int Number1 = 1; Number1 < 12; Number1++) {
    	for (int Number2 = 1; Number2 <= 12; Number2++) {
        System.out.printf("%d x %d = %d\t", Number2, Number1, Number1 * Number2);
    }
    System.out.println();
}
}

}