//37. Write a Java program to create an array of its anti-diagonals from a given square matrix. 
/*
Example:
Input
1 2 3 
4 5 6 
7 8 9
Output
1
2 4
3 5 7 
6 8 
9
*/
import java.util.Scanner;
class anti-diagonals{
	public static void main(String[] args){
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("My Matrix");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		int m=0;
		System.out.println("Diagonals Of Matrix");
		for(int i=0;i<arr.length*2;i++){ 
			for(int j=0;j<arr[0].length;j++){ 
				for(int k=0;k<arr[0].length;k++){ 
					if((j+k)==m)
						System.out.print(arr[j][k]+" ");
				}
			}
			System.out.println();
			m++;
		}
	}		
}