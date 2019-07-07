package nielsen;

import java.util.ArrayList;
import java.util.List;

public class StringAppend
{
	public static String appendString(String s,int itr)

	{
		StringBuffer str=new StringBuffer(s);
		List list= new ArrayList();
 		for(int i=0;i<itr;i++)
		{
			for(int j=0;j<s.length();j++)
			{
              if(s.charAt(j)=='a')
              {
	              str.append('b');
              }
				if(s.charAt(j)== 'b')
				{
					str.append('c');
				}
				if(s.charAt(j)== 'c')
				{
					str.append('a');
				}
			}
			s=str.toString();
			list.add(s);
		}

		return s;
	}

	public static void main(String[] args)
	{
		System.out.println(appendString("ab",20));

	}
}
