package Amex;

public class MaxReverseDigits
{
	public static void solution(int N) {
		// write your code in Java SE 8
       int counter=0;
       int m=0;
       int h=N;
       m=N;
       int a=0;

		while(N > 0)
		{
			N = N / 10;
			counter++;
		}

		int [] b=new int[counter];

		String[] c= new String[counter];

		while(m > 0)
		{
			a = m % 10;
			System.out.println("Digits at position "+counter+":"+a);
			m = m / 10;
			b[counter-1]=a;
			counter--;
		}
		c[0]=String.valueOf(h);
        for(int i=1;i<b.length;i++)
        {

        	StringBuffer sb= new StringBuffer();
        	int[] e=b;
        	int temp=e[0];
        	e[0]=e[i];
        	e[i]=temp;

        	for(int k=0;k<e.length;k++)
	        {
	        	sb.append(e[k]);
	        }
        	c[i]=sb.toString();
        }


		int size = c.length;
		int [] arr = new int [size];
		int max=0;
		for(int i=0; i<size; i++) {
			arr[i] = Integer.parseInt(c[i]);
			if(max<arr[i])
			{
				max=arr[i];
			}

		}

	}

	public static void main(String[] args)
	{
		solution(234);
	}
}
