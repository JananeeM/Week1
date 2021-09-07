package Week1Day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int calc=0,remainder,number;
		number=num;
	
	
		
	
			while(num>0)
			{
				remainder=num%10;
				
				calc=calc+(remainder*remainder*remainder);
				num=num/10;
				System.out.println(calc);
				
						
			}
			if(calc==number)
			{
				System.out.println("The given Number is Armstrong number");
			}
			else
				System.out.println("Given Number is Not an armstrong number");
		

	}

}
