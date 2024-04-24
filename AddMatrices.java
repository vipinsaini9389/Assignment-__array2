//Write a Java program to add two matrices of the same size.


public class AddMatrices {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		//print max 1
		System.out.println("Matrix 1");
		for (int i=0;i<mat1.length;i++){
			for (int j=0;j<mat1[0].length;j++)
				System.out.print(mat1[i][j]+" ");
			System.out.println();
		}
		//print max 2
		System.out.println("Matrix 2");
		for (int i=0;i<mat2.length;i++){
			for (int j=0;j<mat2[0].length;j++)
				System.out.print(mat2[i][j]+" ");
			System.out.println();	
		}
		//Additon of Matrix 1 and Matrix 2
		System.out.println("Additon of Matrix");
		for (int i=0;i<mat1.length;i++){
			for (int j=0;j<mat1[0].length;j++)
				System.out.print(mat1[i][j]+mat2[i][j]+" ");
			System.out.println();
		}
	}
}
