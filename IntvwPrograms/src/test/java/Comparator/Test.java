package Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Test
{

	public static void main(String[] args)
	{
		ArrayList<Employee> list = new ArrayList<>();

		list.add(new Employee(22, "Lokesh",1000.00));
		list.add(new Employee(30, "Lokesh", 1001.00));
		list.add(new Employee(38, "Alex", 1002.00));
		list.add(new Employee(20, "Lokesh", 1003.00));
		list.add(new Employee(60, "Charles", 1004.00));

		System.out.println(list.toString());

		Comparator<Employee> groupByComparator =Comparator.comparing(Employee::getAge);
		Collections.sort(list,groupByComparator  );

		System.out.println(list.toString());

		Comparator<Employee> allComapre =Comparator.comparing(Employee::getName).
				thenComparing(Employee::getDoubleSalary).
				thenComparing(Employee::getAge);

		Collections.sort(list,allComapre);

		System.out.println(list.toString());


	}
}
