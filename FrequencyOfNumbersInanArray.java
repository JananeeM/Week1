package Week1Day2;

import java.util.Arrays;

public class FrequencyOfNumbersInanArray {

	public static void main(String[] args) {
		int[] arr={3,4,2,5,1,2,6,3,6,2,4,7,1};
		int[] frr=new int[arr.length];
		int visit=-1;
		int cou;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			 cou=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{			
					cou++;
					
					frr[j]=visit;
				}		
				
			}
		
			
			if(frr[i]!=visit)
				frr[i]=cou;
		}
			for(int i=0;i<frr.length;i++)
			{
				if(frr[i]!=visit)
			
				System.out.println("The Number "+arr[i]+" Occured "+frr[i]+" Times");
			}
		}
		
		
		
	

}
