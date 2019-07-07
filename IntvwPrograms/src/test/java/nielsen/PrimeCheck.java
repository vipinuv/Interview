package nielsen;

public class PrimeCheck
{
	 static void  primeCheck()
      {
      	int k=0;
      	int arr[]=new int[4];
      	boolean flag =false;
      	for(int j=21;j<40;j++)
        {
	        flag =false;
        	for(int i=2;i<j;i++)
	        {
	        	if(j%i==0)
		        {
		        	flag=true;
		        	break;
		        }
	        }
        	if(!flag)
	        {
		        arr[k++] = j;
	        }
        }

      	for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }

      }
	public static void main(String[] args)
		{
			primeCheck();
		}
}
