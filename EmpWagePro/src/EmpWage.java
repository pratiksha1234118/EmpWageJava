import java.util.*;
public class EmpWage {
		static int empWagePerHour=20;
		static int workTime=8;
		static String Employee;
		static int dailyEmpWage;
		static int partTimeEmpWage;
		static int partTime=4;
		static int empWage;
		static int totalEmpWage;
		static int employeeHours;
		static int total;
	    public static void Attendance() {
		int emp=(int)(Math.random()*2);
		if(emp==1)
		{ 
			Employee="present";
			System.out.println("employee is present");
		}
		else
		{	
			System.out.println("employee is absent");
		}
	    }
	    public static void dailyWage()
	    {
	    	if(Employee=="present")
	    	 {
	    	dailyEmpWage=(empWagePerHour*workTime);
	    	System.out.println("Daily Wage of Employee is :"+dailyEmpWage);
	    	empWage=dailyEmpWage;
		    }
		else
		{
			dailyEmpWage=0;
			System.out.println("Daily wage of Employee is :"+dailyEmpWage);
		}
	    }
	    
	    public static void partTimeWage()
	    {
	    	if(Employee=="present")
	    	 {
	    	partTimeEmpWage=(empWagePerHour*partTime);
	    	System.out.println("part time of Employee is :"+partTimeEmpWage);
	    	empWage=partTimeEmpWage;
		    }
		else
		{
			partTimeEmpWage=0;
			System.out.println("part time of employee wage of Employee is :"+partTimeEmpWage);
		}
	    }
	    public static void checkifAvailable() 
	    {
	    int person=(int)(Math.random()*3);
	    if(person==1)
	    {
	    dailyWage();
	    int empWage=dailyEmpWage;
	    }
	    else if(person==2)
	    {
	    partTimeWage();
	    empWage=partTimeEmpWage;
	    }
	    else
	    empWage=0;
	    
	    }
	    public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			Attendance();
			if(Employee=="present")
			{ 
				System.out.println("1.wages of the employee who does full time");
				System.out.println("2.wages of the employee who does part time");
				System.out.println("enter your choice");
				int choice=sc.nextInt();
				switch(choice)
	    		{
	    			case 1:
	    				dailyWage();
	    				break;
	    			case 2:
	    			    partTimeWage();
	    			   break;	
	    			default:
	    				break;
	    		}	
				
		   
			System.out.println("employee wage for month");
			for(int i=0; i<=20; i++)
			{
				checkifAvailable();
				totalEmpWage+=empWage;
			}
			System.out.println("total wage of month:"+totalEmpWage);
			for(int j=1;j<=100;j++)
			{

			total+=empWagePerHour;
			}
			System.out.println(" Wages reaches for a monthfor working 100 hours is : "+total);
			
			}
		}
	}
