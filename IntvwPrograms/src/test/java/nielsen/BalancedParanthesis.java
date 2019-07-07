package nielsen;

import java.util.Stack;

public class BalancedParanthesis
{
	static  void balaParanthesis(String s)
	{
		Stack stack=new Stack();

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				stack.push(s.charAt(i));
			}
			if(s.charAt(i)=='[')
			{
				stack.push(s.charAt(i));
			}
			if(s.charAt(i)=='{')
			{
				stack.push(s.charAt(i));
			}
			if(s.charAt(i)==')')
			{
				stack.pop();
			}
			if(s.charAt(i)==']')
			{
				stack.pop();
			}
			if(s.charAt(i)=='}')
			{
				stack.pop();
			}
		}

		if(stack.isEmpty())
		{
			System.out.println("Balanced");
		}
		else
		{

				System.out.println("UNBalanced");
			}

	}

	public static void main(String[] args)
	{
		String s="(a*(c+d))";
		balaParanthesis(s);

	}
}
