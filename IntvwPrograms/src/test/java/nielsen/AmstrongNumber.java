package nielsen;

public class AmstrongNumber
{
	static void isAmstrong(int number)
	{
		int originalNumber, remainder, result = 0;
		if(number==0|number==1)
		{
			System.out.println(number + " is an Armstrong number.");
		}
		originalNumber = number;
		while (originalNumber != 0)
		{
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}
		if(result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
	}





	public static void main(String[] args)
	{
		isAmstrong(153);

	}
}
