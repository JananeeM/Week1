package Week1Day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
		System.out.println(arr.length);
		
		for(int i=arr[0];i<arr.length;i++)
		{
			
			if(i!=arr[i-1])
			{
				System.out.println("Missing number in the given array is "+i);
				break;
			}
		}

	}

}
