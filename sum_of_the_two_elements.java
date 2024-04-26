//35. Write a Java program to find the sum of the two elements of a given array equal to a given integer.
//Sample array: [1,2,4,5,6]
//Target value: 6
import java.util.Scanner;
class sum_of_the_two_elements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6};
		System.out.print("My Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.print("\nEnter A Number : ");
		int num = sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]+arr[j])==num){
					System.out.println("1st Value : "+arr[i]);
					System.out.println("2nd Value : "+arr[j]);
					flag=1;
				}
				if(flag==1)
					break;
			}
		}
		if(flag==0)
			System.out.println("Combination Not Found!");
	}
}