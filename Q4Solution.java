public class Q4Solution {
    public static void main(String[] args) {
        int n=15;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (row-column>=(n-1)/2||row+column>=(n-1+(n-1)/2)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            } System.out.println("");

        }
    }
}
