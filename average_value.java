 //29.Write a Java program to compute the average value of an array of integers except the largest and smallest values.

class average_value{
	public static void main(String[] args){
		int[] arr = {2,4,6,6,3,1,5,7,9,5};
		int max = arr[0];
		int min = arr[0];
		System.out.print("Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
			if((arr[i]!=min)&&(arr[i]!=max))
				sum=sum+arr[i];
		float avg = (float)sum/(arr.length-2);
		System.out.println("\nMinimum : "+min);
        System.out.println("Maximum : "+max);
		System.out.println("Excepts Minimum and Maximum Value Average : "+avg);
	}
}