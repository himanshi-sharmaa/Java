import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

public class XYZ {
	
	static  int position_y=0;
	static  int position_x=50;
	
	static JFrame Menu(JFrame m)
	{
		final JFrame my=m;
		
		if(my==null)
		{
		JFrame mframe= new JFrame("Inventory Project");
		mframe.setSize(800,800);
		mframe.setLayout(null);
		mframe.setVisible(true);
		mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel cname= new JLabel("WELCOME TO XYZ");
		cname.setBounds(position_x,position_y,200,200);
		cname.setVisible(true);
		mframe.add(cname);
		
		JLabel cdescp= new JLabel("CLICK ANY ONE");
		cdescp.setBounds(100,position_y+50,200,200);
		cdescp.setVisible(true);
		mframe.add(cdescp);
		
		JButton memp=new JButton("Employee");
		memp.setBounds(position_x,position_y+200,500,100);
		memp.setVisible(true);
		mframe.add(memp);
		
		//onclick event
		memp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			Employee_form(my);
			}});
		
		JButton msales=new JButton("Sales");
		msales.setBounds(position_x,position_y+300,500,100);
		msales.setVisible(true);
		mframe.add(msales);
		msales.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Sales_form(my);
			}});
		
		JButton mreport=new JButton("Report");
		mreport.setBounds(position_x,position_y+400,500,100);
		mreport.setVisible(true);
		mframe.add(mreport);
		
		mreport.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					Report_form(my);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					String message="Something Unexpected occured.";
					JOptionPane.showMessageDialog(new JFrame(), message, "Oops!",
					        JOptionPane.ERROR_MESSAGE);
				}
			}});
		return my;
		}
		return my;
	}
	
	
	static void Employee_form(JFrame mf)
	{
		position_x=100;
		position_y=0;
		JFrame nf=new JFrame("Employee Form");
		nf.setSize(800,800);
		nf.setLayout(null);
		nf.setVisible(true);
		nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Labels
		JLabel empid=new JLabel("Employee Id-");
		empid.setBounds(position_x,position_y,200,100);
		empid.setVisible(true);
		nf.add(empid);
		
		JLabel name=new JLabel("Employee Name-");
		name.setBounds(position_x,position_y+50,200,100);
		name.setVisible(true);
		nf.add(name);
		
		JLabel empsal=new JLabel("Employee Salary-");
		empsal.setBounds(position_x,position_y+100,200,100);
		empsal.setVisible(true);
		nf.add(empsal);
		
		//Text Fields
		final JTextField empid_txt= new JTextField();
		empid_txt.setBounds(position_x+210,position_y+40,200,20);
		empid_txt.setVisible(true);
		nf.add(empid_txt);
		
		final JTextField empname_txt= new JTextField();
		empname_txt.setBounds(position_x+210,position_y+90,200,20);
		empname_txt.setVisible(true);
		nf.add(empname_txt);
		
		final JTextField empsal_txt= new JTextField();
		empsal_txt.setBounds(position_x+210,position_y+140,200,20);
		empsal_txt.setVisible(true);
		nf.add(empsal_txt);
		
		final JButton madd=new JButton("ADD EMPLOYEE");
		madd.setBounds(position_x+100,position_y+180,200,50);
		madd.setVisible(true);
		nf.add(madd);
		
		madd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
				try{	
				int id;
				String name="";
				double sal;
				
				id=Integer.parseInt(empid_txt.getText());
				name=empname_txt.getText();
				sal=Double.parseDouble(empsal_txt.getText());
				Employee emp=new Employee(id,name,sal);
				
				try{
				File f=new File("employees.txt");
				FileWriter fout=new FileWriter(f,true);
				fout.write(emp.getId());fout.write('\n');
				fout.write(emp.getName());fout.write('\n');
				fout.write(emp.getSalary());fout.write('\n');
				fout.flush();
				fout.close();
				String message="Employee Added!";
				JOptionPane.showMessageDialog(new JFrame(), message, "Succesfull",
				        JOptionPane.OK_OPTION);
				
				}catch(Exception E)
				{
					String message="Error while saving data to file!";
					JOptionPane.showMessageDialog(new JFrame(), message, "Error",
					        JOptionPane.ERROR_MESSAGE);
					
				}
				}catch(Exception E)
				{
					String message="Something Unexpected occured.";
					JOptionPane.showMessageDialog(new JFrame(), message, "Oops!",
					        JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
	}
	
	
	static void Sales_form(JFrame mf)
	{
			
			position_x=100;
			position_y=0;
			JFrame nf=new JFrame("Sales Form");
			nf.setSize(800,800);
			nf.setLayout(null);
			nf.setVisible(true);
			nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//Labels
			JLabel pid=new JLabel("Product Id-");
			pid.setBounds(position_x,position_y,200,100);
			pid.setVisible(true);
			nf.add(pid);
			
			JLabel pname=new JLabel("Product Price-");
			pname.setBounds(position_x,position_y+50,200,100);
			pname.setVisible(true);
			nf.add(pname);
			
			
			//Text Fields
			final JTextField pid_txt= new JTextField();
			pid_txt.setBounds(position_x+210,position_y+40,200,20);
			pid_txt.setVisible(true);
			nf.add(pid_txt);
			
			final JTextField price_txt= new JTextField();
			price_txt.setBounds(position_x+210,position_y+90,200,20);
			price_txt.setVisible(true);
			nf.add(price_txt);
			
			final JButton madd=new JButton("ADD PRODDUCT");
			madd.setBounds(position_x+100,position_y+180,200,50);
			madd.setVisible(true);
			nf.add(madd);
			
			madd.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					
					try{
					
					int id;
					double price;
					
					id=Integer.parseInt(pid_txt.getText());
					price=Double.parseDouble(price_txt.getText());
					Product pr=new Product(id,price);
					
					try{
					File f=new File("products.txt");
					FileWriter fout=new FileWriter(f,true);
					fout.write(pr.getId());fout.write('\n');
					fout.write(pr.getPrice());fout.write('\n');
					fout.flush();
					fout.close();
					String message="Product Added!";
					JOptionPane.showMessageDialog(new JFrame(), message, "Succesfull",
					        JOptionPane.OK_OPTION);
					
					}catch(Exception E)
					{
						String message="Error while saving data to file!";
						JOptionPane.showMessageDialog(new JFrame(), message, "Error",
						        JOptionPane.ERROR_MESSAGE);
						
					}
					}catch(Exception E)
					{
						String message="Something Unexpected occured.";
						JOptionPane.showMessageDialog(new JFrame(), message, "Oops!",
						        JOptionPane.ERROR_MESSAGE);
					}
				}
			});	
		}

	static void Report_form(JFrame mf) throws IOException
	{
			
		position_x=100;
		position_y=0;
		JFrame nf=new JFrame("Report");
		nf.setSize(800,800);
		nf.setLayout(null);
		nf.setVisible(true);
		nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		///Employee Report
		//
		JLabel emptxt=new JLabel("EMPLOYEES-");
		emptxt.setBounds(position_x,position_y,200,100);
		emptxt.setVisible(true);
		nf.add(emptxt);
		
		List<Employee> mlist;
		mlist=ReadEmployees();
		int n=mlist.size();
		String [][] rows=new String[n][3];
		for(int i=0;i<n;i++)
		{
				rows[i][0]=mlist.get(i).getId();
				rows[i][1]=mlist.get(i).getName();
				rows[i][2]=mlist.get(i).getSalary();
		}
		double emp_sum=0;
		for(int k=0;k<mlist.size();k++)
		{
			emp_sum+=mlist.get(k).getSal();
		}
		System.out.print(String.valueOf(emp_sum));
		String columns[]={"ID","NAME","SALARY"};
		JTable memptable=new JTable(rows,columns);
		memptable.setBounds(position_x,position_y+80,200,300);
		memptable.setSize(300,400);
		memptable.setVisible(true);
		nf.add(memptable);
		
		
		JLabel emp_total=new JLabel("Total Employee Revenue- "+String.valueOf(emp_sum));
		emp_total.setBounds(position_x,position_y+500,500,100);
		emp_total.setVisible(true);
		nf.add(emp_total);

		//
		///
		
		///Product Report
		//
		JLabel pr_txt=new JLabel("PRODUCTS-");
		pr_txt.setBounds(position_x+400,position_y,200,100);
		pr_txt.setVisible(true);
		nf.add(pr_txt);
		
		List<Product> prlist=new ArrayList<Product>();
		prlist=ReadProducts();
		int m=prlist.size();
		String [][] rows_pr=new String[m][2];
		
		for(int i=0;i<m;i++)
		{
				rows_pr[i][0]=prlist.get(i).getId();
				rows_pr[i][1]=prlist.get(i).getPrice();
				
		}
		double pr_sum=0;
		
		for(int s=0;s<m;s++)
		{
			pr_sum+=prlist.get(s).getPriced();
		}
		
		System.out.print(String.valueOf(pr_sum));
		String columns_pr[]={"ID","PRICE"};
		JTable mprtable=new JTable(rows_pr,columns_pr);
		mprtable.setBounds(position_x+350,position_y+80,200,300);
		mprtable.setSize(300,400);
		mprtable.setVisible(true);
		nf.add(mprtable);
		
		
		JLabel pr_total=new JLabel("Total Product Sales- "+String.valueOf(pr_sum));
		pr_total.setBounds(position_x+400,position_y+500,500,100);
		pr_total.setVisible(true);
		nf.add(pr_total);
		///
		//
		
		float profit=(int)(emp_sum-pr_sum);
		if(profit>0)
		{
			String message="Company XYZ has acheived a Profit of "+String.valueOf((int)(profit/pr_sum))+"%";
			JOptionPane.showMessageDialog(new JFrame(), message, "Profit!",
			        JOptionPane.OK_OPTION);
		}
		else
		{
			profit=(int)(pr_sum-emp_sum);
			String message="Company XYZ has acheived a Loss of "+String.valueOf((int)(profit/pr_sum))+"%";
			JOptionPane.showMessageDialog(new JFrame(), message, "Loss!",
			        JOptionPane.OK_OPTION);
		}
	}
	
	static List<Employee> ReadEmployees() throws IOException
	{
		List<Employee> mlist=new ArrayList<Employee>();
		File file=new File("employees.txt");
		FileReader in=new FileReader(file);
		BufferedReader mbuff=new BufferedReader(in);
		String line = mbuff.readLine();
		Employee em=new Employee();
		int i=1;
		while(line != null){
			//System.out.println(line);
			if(i==1)
			{
				int id=Integer.parseInt(line);
				em.setId(id);
			}
			
			if(i==2)
			{
				em.setName(line);
			}
           
			if(i==3)
			{
				double d=Double.parseDouble(line);
				em.setSalary(d);
				mlist.add(em);em=new Employee();i=0;
			}
			
			
			line = mbuff.readLine();i++;
        }        
		in.close();	
		return mlist;
	}
	
	static List<Product> ReadProducts() throws IOException
	{
		List<Product> mlist=new ArrayList<Product>();
		File file=new File("products.txt");
		FileReader in=new FileReader(file);
		BufferedReader mbuff=new BufferedReader(in);
		String line = mbuff.readLine();
		Product pr=new Product();
		int i=1;
		while(line != null){
			//System.out.println(line);
			if(i==1)
			{
				int id=Integer.parseInt(line);
				pr.setId(id);
			}
			
			if(i==2)
			{
				pr.setPrice(Double.parseDouble(line));
				mlist.add(pr);pr=new Product();i=0;
			}			
			line = mbuff.readLine();i++;
        }        
		in.close();	
		return mlist;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame mf=null;
		mf=Menu(mf);
		/*Employee E=new Employee();
		Product P=new Product();
		Sales S=new Sales();
		
		
		ArrayList<Employee> myemps=new ArrayList<Employee>();
		ArrayList<Product> myprod=new ArrayList<Product>();
		
		myemps=E.GetEmployeeDetails(5);
		myprod=P.GetProducts(5);
		S.SalesAmmount();
		
		InventoryReport myreport=new InventoryReport(myemps,myprod,S);
		myreport.ShowReport();
		*/

	}

}
