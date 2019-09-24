package Comparator;

import java.util.Objects;

public class Employee
{

	public Integer  age;
	public String name;
	public Double doubleSalary;

	public Employee(Integer age, String name, Double doubleSalary)
	{
		this.age = age;
		this.name = name;
		this.doubleSalary = doubleSalary;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getDoubleSalary()
	{
		return doubleSalary;
	}

	public void setDoubleSalary(double doubleSalary)
	{
		this.doubleSalary = doubleSalary;
	}

	@Override
	public boolean equals(Object o)
	{
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return age == employee.age &&
				Double.compare(employee.doubleSalary, doubleSalary) == 0
				&& Objects.equals(name, employee.name);
	}

	@Override
	public int hashCode()

	{
		int prime =31;
		int result=1;
		result = (prime * result) + ((age == null) ? 0 : age.hashCode());
		result = (prime * result) + ((name == null) ? 0 : name.hashCode());
		result = (prime * result) + ((doubleSalary == null) ? 0 : doubleSalary.hashCode());

		return result;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", slary=" + doubleSalary + "]";
	}

}
