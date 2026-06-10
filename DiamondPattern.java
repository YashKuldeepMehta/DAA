public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 4;

        

        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
        
        }
    }
}
