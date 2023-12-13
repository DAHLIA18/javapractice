public class TabularOutput {

    public static void main(String[] args) {
        System.out.println("N\tN2\tN3\tN4");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i) + "\t" + (i * i * i * i));
        }
    }
}
