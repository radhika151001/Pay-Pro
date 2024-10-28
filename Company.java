package com.service;
import java.util.Scanner;
import com.model.EmployeeDetails;

public class Company {
	public int housingAllowance=3000, transportAllowance=1500;
	EmployeeDetails e=new EmployeeDetails();
	
	public void setDetails() {
		System.out.println("***************WELCOME TO PAYPRO***************");
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Employee Name:");
		String name=s.nextLine();
		e.setName(name);
		System.out.println("Enter ID:");
		int id=s.nextInt();
		e.setId(id);
		System.out.println("Choose Department name:\n1.Java Developer\n2.Tester\n3.Full Stack Developer\n4.Cybersecurity");
		int dept=s.nextInt();
	   e.setDept(dept);
	    if(dept>=5) {
	    	System.out.println("Please enter a valid department number");
	    System.exit(dept);
	    }
		
		System.out.println("Enter number of total leave in this month:");
		int leaves=s.nextInt();
		e.setLeaves(leaves);
		System.out.println("Overtime days:");
		int overtime=s.nextInt();
		e.setOvertime(overtime);
		}
	
	  public void getDetails() {
		  System.out.println("-----------------Employee Details----------------");
			System.out.println("Name:"+e.getName());
			System.out.println("ID:"+e.getId());
			
			if (e.getDept() == 1) {
			    System.out.println("Department: Java Developer");
			} else if (e.getDept() == 2) {
			    System.out.println("Department: Tester");
			} else if (e.getDept()== 3) {
			    System.out.println("Department: Full Stack Developer");
			} else if (e.getDept() == 4) {
			    System.out.println("Department: Cybersecurity");
			} 
			
			System.out.println("Total leaves:"+e.getLeaves());
			System.out.println("Total overtime days:"+e.getOvertime());
			e.setTotalWorkingDays(30 + e.getOvertime() - e.getLeaves()); // Set the total working days
			System.out.println("Total working days: " + e.getTotalWorkingDays());
			
			
			
			System.out.println("Housing Allowances:"+housingAllowance+"\t\tTransport Allowances:"+transportAllowance);
	}
	  
	  public void salaryDetails() {
			
			
			if(e.getDept() ==1) {
				System.out.print("Base Salary=25000");
				float oneDaySalary=25000/30;
				float gst;
				System.out.println("\tGST:"+( gst=(25000*18)/100));
				e.setTotalSalary(oneDaySalary*e.getTotalWorkingDays()+housingAllowance+transportAllowance-gst);
			}
			if(e.getDept() ==2) {
				float oneDaySalary=20000/30;
				System.out.print("Base Salary=20000");
				float gst;
				System.out.println("\tGST:"+( gst=(20000*18)/100));
				e.setTotalSalary(oneDaySalary*e.getTotalWorkingDays()+housingAllowance+transportAllowance-gst);
			}
			if(e.getDept() ==3) {
				float oneDaySalary=30000/30;
				System.out.print("Base Salary=30000");
				float gst;
				System.out.println("\tGST:"+( gst=(30000*18)/100));
				e.setTotalSalary(oneDaySalary*e.getTotalWorkingDays()+housingAllowance+transportAllowance-gst);
			}
			if(e.getDept() ==4) {
				float oneDaySalary=35000/30;
				System.out.print("Base Salary=35000");
				float gst;
				System.out.println("\tGST:"+( gst=(35000*18)/100));
				e.setTotalSalary(oneDaySalary*e.getTotalWorkingDays()+housingAllowance+transportAllowance-gst);
			}
			
			System.out.println("Total Salary:"+e.getTotalSalary());
			
			
		
		}
		
	  
	 
}
