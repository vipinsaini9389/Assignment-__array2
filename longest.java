//34. Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers. Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
class longest{
	public static void main(String[] args){
		int[] arr = {49, 1, 3, 200, 2, 4, 70, 50};
		int high = 0;
		for(int i=0;i<arr.length;i++){
			int temp=1;				
			int count=1; 			
			for(int j=0;j<arr.length;j++){ 
				if(arr[j]==(arr[i]+count)){
					temp++;
					count++;
					j=0;
				}
			}
			if(high<temp)
				high=temp;
		}
		System.out.println("Highest Consicutive Length : "+high);
	}
}