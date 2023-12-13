public class DeMorgansLaws {
    public static void main(String[] args) {
        int x = 3, y = 8, a = 5, b = 5, g = 3, i = 2, j = 7;

       
        boolean originalA = !(x < 5) && !(y >= 7);
        boolean originalB = !(a == b) || !(g != 5);
        boolean originalC = !((x <= 8) && (y > 4));
        boolean originalD = !((i > 4) || (j <= 6));

     
        boolean equivalentA = !(x < 5) || (y < 7);
        boolean equivalentB = (a != b) && (g == 5);
        boolean equivalentC = (x > 8) || (y <= 4);
        boolean equivalentD = (i <= 4) && (j > 6);

  
        System.out.println("Original A: " + originalA + " | Equivalent A: " + equivalentA);
        System.out.println("Original B: " + originalB + " | Equivalent B: " + equivalentB);
        System.out.println("Original C: " + originalC + " | Equivalent C: " + equivalentC);
        System.out.println("Original D: " + originalD + " | Equivalent D: " + equivalentD);
    }
}