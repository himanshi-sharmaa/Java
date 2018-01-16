import java.util.ArrayList;



public class InventoryReport implements ReportInterface{
	
	ArrayList<Employee> Emp_list;
	ArrayList<Product> Pr_list;
	Sales ms;
	
	
	InventoryReport()
	{
		Emp_list=null;
		Pr_list=null;
		ms=null;
	}
	
	InventoryReport(ArrayList<Employee> e,ArrayList<Product> p, Sales s)
	{
		Emp_list=e;
		Pr_list=p;
		ms=s;
	}
	
	public void ShowReport()
	{
		double emp_sum=0;
		double pr_sum=0;
		double sales=0;
		double total;
		
		for(int i=0;i<Emp_list.size();i++)
			{emp_sum+=Emp_list.get(i).getSal();}
		
		for(int i=0;i<Pr_list.size();i++)
			{pr_sum+=Pr_list.get(i).getPriced();}
		sales=ms.getSalesPrice();
		
		total=emp_sum+pr_sum;
		System.out.println("Total Company revenue- "+String.valueOf(total));
		if(total<sales)
			System.out.println("Company acheived Profit!!!");
		else
			System.out.println("Company acheived Loss!!!");
	}

}
