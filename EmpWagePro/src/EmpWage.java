public class EmpWage {
		static int empWagePerHour=20;
		static int workTime=8;
		static String Employee;
		static int dailyEmpWage;
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
		    }
		else
		{
			dailyEmpWage=0;
			System.out.println("Daily wage of Employee is :"+dailyEmpWage);
		}
		    	
	    }
	    
		public static void main(String args[])
		{
			Attendance();
			dailyWage();
		}
	}
