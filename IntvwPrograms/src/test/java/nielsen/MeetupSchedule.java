package nielsen;

import java.util.ArrayList;
import java.util.List;

public class MeetupSchedule
{

	public static  int investment(List<Integer> s, List<Integer> e)
	{
		int temp1=0;
		int temp2=0;
		int count =1;

		for (int i=0;i<s.size();i++)
		{
			if(temp1!=0 || temp2!=0)
			{
				if(temp1==s.get(i) && temp2==e.get(i))
				{
					continue;
				}
				if(temp2==s.get(i))
				{
					count++;
				}
				else if(temp1==s.get(i))
				{
					count++;
				}
			}
			temp1=s.get(i);
			temp2=e.get(i);

		}
		return count;
	}

	public static void main(String[] args)
	{
         List<Integer> s= new ArrayList<>();
          s.add(1);
          s.add(2);
          s.add(3);
          s.add(3);
          s.add(3);
		List<Integer> e= new ArrayList<>();
		e.add(2);
		e.add(3);
		e.add(3);
		e.add(4);
		e.add(4);


		int value=investment(s,e);
		System.out.println(value);



	}
}
