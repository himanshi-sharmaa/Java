import java.util.ArrayList;
import java.util.Scanner;

public class Product implements ProductInterface {
	
	int pr_id;
	double pr_price;
	Scanner ns;
	static int pcount;
	
	public Product()
	{
		pcount=0;
		pr_id=0;
		pr_price=0.00;
	}
	
	public Product(int id,double pr)
	{
		pr_id=id;
		pr_price=pr;
	}
	
	//getters
	String getId()
	{return String.valueOf(pr_id);}
	
	String getPrice()
	{return String.valueOf(pr_price);}
	
	double getPriced()
	{return pr_price;}
	
	int getProductCount()
	{return pcount;}
	
	//setters
	boolean setId(int id)
	{pr_id=id;return true;}
	
	boolean setPrice(double pr)
	{pr_price=pr;return true;}
	 
	
	//Method to get Products Details
	
	public ArrayList<Product> GetProducts(int n)
	{
		
		ns= new Scanner(System.in);
		ArrayList<Product> myproducts=new ArrayList<Product>();
		try{
		for(int i=0;i<n;i++)
		{
			int id;
			double price;
			Product p=new Product();
			
			System.out.println("Product ID- ");
			id=ns.nextInt();
			System.out.println("Product Price- ");
			price=ns.nextDouble();
			
			p.setId(id);
			p.setPrice(price);
			
			myproducts.add(p);pcount++;	
		}
		}catch(Exception E)
		{
			System.out.println("Something went wrong.Try Again!");
			GetProducts(n);
		}
		return myproducts;
	}
	
	public void ShowProducts(ArrayList<Product> mp)
	{
		Product p=new Product();
		System.out.println("Product Information-");
		for(int i=0;i<mp.size();i++)
		{
			p=mp.get(i);
			System.out.println("Product Id- "+p.getId());
			System.out.println("Product Price- "+p.getPrice());
			System.out.println("#############################");
		}
	}
	
	
	

}
