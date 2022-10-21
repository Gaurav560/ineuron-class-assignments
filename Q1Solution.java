public class Q1Solution {
    public static void main(String[] args) {
        int n=7;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++)
            {
                if (row==0||row==n-1||column==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.print("   ");

            for (int column = 0; column < n; column++)
            {
                if (row==column||column==0||column==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("   ");

            for (int column = 0; column < n; column++)
            {
                if (row==0||column==0||row==n-1||row==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.print("   ");


            for (int column = 0; column < n; column++)
            {
                if (column==0&&row<n-1||column==n-1&&row<n-1||row==n-1&&column>0&&column<n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.print("   ");


            for (int column = 0; column < n; column++)
            {
                if (column==0||row-column==(n-1)/2||column==(n-1)/2&&row<=(n-1)/2||row==(n-1)/2&&column<=(n-1)/2||row==0&&column<=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.print(" ");



            for (int column = 0; column < n; column++)
            {
                if (row==0&&column>0&&column<n-1||row==n-1&&column>0&&column<n-1||column==0&&row>0&&row<n-1||column==n-1&&row>0&&row<n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.print("  ");

            for (int column = 0; column < n; column++)
            {
                if (row==column||column==0||column==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");



        }
    }
}
