public class Q3Solution {
    public static void main(String[] args) {
        int n=14;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (row+column<=(n-1)/2||row==0||column==0||column-row>=((n/2)-1)||row==n-1||column==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
            
        }
    }
}
//&&row==0&&column>=(n-1)/2
//&&column==n-1&&row<=(n/2)-1