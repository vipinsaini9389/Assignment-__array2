/*Write a Java program to print the following grid with help of array.

Expected Output :

***************
***************
***************
***************
***************
***************
***************
***************
*/
public class Grid {

    public static void main(String[] args) {
        char[][] grid = new char[9][15]; 
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 15; j++) {
                grid[i][j] = '*';
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
