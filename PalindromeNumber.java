package Week1Day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=454;
		int temp=num,r,sum=0;
		while(num>0)
			
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;	
			//System.out.println(sum);
		}
		if(temp==sum)		
			System.out.println("The given number is a palindrome");
		else
			System.out.println("The given number is not a palindrome");
		
			

	}

}
