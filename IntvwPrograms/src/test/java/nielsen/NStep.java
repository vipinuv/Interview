package nielsen;

public class NStep
{
	public int findStep(int n)
	{
		if(n==0 | n==1)
			return 1;
		if(n==2)
			return 2;
		else
			return findStep(n-1)+findStep(n-2)+findStep(n-3);


	}

	public static void main(String[] args)
	{
		NStep step=new NStep();
        System.out.println(step.findStep(Integer.parseInt("4")));
        Integer.parseInt("");
	}
}
