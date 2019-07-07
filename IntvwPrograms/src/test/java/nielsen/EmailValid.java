package nielsen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class EmailValid
{

	public static boolean isValid(String email)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
				"[a-zA-Z0-9_+&*-]+)*@" +
				"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
				"A-Z]{2,7}$";
		Pattern pat=Pattern.compile(emailRegex);
		if(email==null)
		{
			return false;
		}
		return pat.matcher(email).matches();
	}
	public static void main(String[] args)
	{
		/*String email="vipinuv@gmail.com";
       if(isValid(email))
       {
       	System.out.println("YES");
       }
       else
       {
	       System.out.println("NO");
       }*/


		String s="(4,6), (5,5), (5,6), (4,5)";
		String s1=s.replaceAll("[()]","");
		System.out.println(s);
		/*StringTokenizer st=new StringTokenizer(s,"),");
		StringBuffer sb=new StringBuffer();

		while(st.hasMoreTokens())
		{
			String s1=st.nextToken();
			if(s1.contains("("))
				sb.append(s1.replace("(","")).append(" ");
            else
            	sb.append(s1).append(" ");
		}*/
/*
		System.out.println(sb);
*/


		String str[]  = s1.split(",");

		List nl = new ArrayList();
		nl = Arrays.asList(str);
		System.out.println(nl);

		List n1= new ArrayList();
		List n2= new ArrayList();
		List n3= new ArrayList();
		List n4= new ArrayList();


		for(int i=0;i<nl.size();i++)
		{
			System.out.println(nl.get(i));

			if(i==1|i==3)
			{
				n2.add(nl.get(i));
			}
			if(i==5|i==7)
			{
				n4.add(nl.get(i));
			}

		}

		System.out.println(n1+""+n2+""+n3+""+n4);
		System.out.println(n2.equals(n4));


	/*	for(Object s3: nl){
			System.out.println(s);
		}*/


	}
}
