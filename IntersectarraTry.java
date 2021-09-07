package Week1Day2;

import java.util.Arrays;

public class IntersectarraTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("Sorted first array");
		
	
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(+arr1[i]);
		}
		System.out.println("Sorted second array");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(+arr2[i]);
		}
		int m=arr1.length;
		int n=arr2.length;
		int i = 0, j = 0;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if (arr1[i] < arr2[j])
	              continue;
			
	            if(arr2[j] < arr1[i])
	            
	                continue;
	            
	            
	            else {
	                System.out.print(+arr2[j++] + " ");
	                i++;
	            }
		}
	}

}
}
