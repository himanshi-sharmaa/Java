
/*Author-Heerok Banerjee
 * Project- Banking Application
 * Version-1.0
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Employee implements EmployeePortal {
	
	int emp_id;
	String name;
	double emp_sal;
	Scanner ns;
	
	
	public Employee()
	{
		emp_id=0;
		name="";
		emp_sal=0.00;
	}
	
	public Employee(int id,String n,double s)
	{
		emp_id=id;
		name=n;
		emp_sal=s;
	}
	//getters
	String getId()
	{return String.valueOf(emp_id);}
	
	String getName()
	{return name;}
	
	String getSalary()
	{return String.valueOf(emp_sal);}
	
	double getSal()
	{return emp_sal;}
	
	//setters
	
	boolean setId(int id)
	{emp_id=id;return true;}
	
	boolean setName(String n)
	{name=n;return true;}
	
	boolean setSalary(double d)
	{emp_sal=d;return true;}
	
	//Method to get Employee details
	
	public ArrayList<Employee> GetEmployeeDetails(int n)
	{
		
		ns=new Scanner(System.in);
		ArrayList<Employee> myemps=new ArrayList<Employee>();
		try{
		for(int i=0;i<n;i++)
		{
			Employee emp=new Employee();
			int id;
			String s;
			double sal;
			System.out.println("Employee"+i);
			System.out.println("Employee Id-");
			id=ns.nextInt();
			emp.setId(id);
			System.out.println("Employee Name-");
			s=ns.next();
			emp.setName(s);
			System.out.println("Employee Salary-");
			sal=ns.nextDouble();
			emp.setSalary(sal);
			System.out.println("******************");
			myemps.add(emp);
		}
		}catch(Exception E)
		{
			System.out.println("Something went unexpected!Please try again.");
			GetEmployeeDetails(n);
		}
		return myemps;
	}
	
	//Method to Print Employee Details
	public void ShowAllEmployees(ArrayList<Employee> emps)
	{
		Employee memp;
		System.out.println("Employee Information-");
		for(int i=0;i<emps.size();i++)
		{
			memp=emps.get(i);
			System.out.println("Employee Id- "+memp.getId());
			System.out.println("Employee Name- "+memp.getName());
			System.out.println("Employee Salary- "+memp.getSalary());
			System.out.println("--------------------------------");
		}
	}

}
