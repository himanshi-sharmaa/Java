import java.util.Scanner;
public class Sales implements SalesInterface {
	
	int sales_count;
	double sales_price;
	Scanner ns;
	Sales()
	{
		sales_count=0;
		sales_price=0.00;
	}
	
	//getters
	int getSalesCount()
	{return sales_count;}
	
	double getSalesPrice()
	{return sales_price;}
	
	String getSales()
	{return String.valueOf((Double)(sales_count*sales_price));}

	public void SalesAmmount() {
		try{
		ns=new Scanner(System.in);
		System.out.println("Enter number of products sold - ");
		sales_count=ns.nextInt();
		System.out.println("Enter per product cost- ");
		sales_price=ns.nextDouble();
		System.out.println("Total Sales Ammount- "+getSales());
		}catch(Exception E)
		{
			System.out.println("Lets Do that again!!");
			SalesAmmount();
		}
	}

}
