import java.util.*;
public class EmpWage {
	public static int empWagePerHr=20;
	static int workingDays=20;
	static int maxHrInMonth=100;
	static int empHrs=0;
	static int totalWage=0;
	static int totalEmpHrs=0;
	static int totalWorkingDay=0;
	static int empWage;
	
	public static int empwage()
	{
	while (totalEmpHrs<=100&&totalWorkingDay<20)
	{
		totalWorkingDay++;
		int check=(int)Math.floor(Math.random()*10)%3;
			switch(check)
			{
			case 1:
				empHrs=8; 
				break;
			case 2:
				empHrs=4;
				break;
			default:
				empHrs=0;
			}
			totalEmpHrs+=empHrs;
			empWage=empHrs*empWagePerHr;
			System.out.println("day:" +totalWorkingDay+ "Employeehrs" +empHrs+ "employeeWages" +empWage);
			}
	totalWage=totalEmpHrs*empWagePerHr;
	System.out.println("total employee wgae"+totalWage);
	return totalWage;
	}
	private static String companyName;
	private static int wagePerHour;
	private static int fullDayHour;
	private static int totalHours;
	private static int dayPerMonth;

	EmpWage( String companyName, int wagePerHour, int fullDayHour, int totalHours, int dayPerMonth) {
		this.companyName=companyName;
		this.wagePerHour = wagePerHour;
		this.fullDayHour = fullDayHour;
		this.totalHours = totalHours;
		this.dayPerMonth = dayPerMonth;
	}
	
		private static void CompnayWage() {
			//variable
			int dailyWage;
			int dailyHours;
			int monthlyWage = 0;
			int hours = 0;
			int day = 0;
			//computation
			while ( hours <= totalHours && day <= dayPerMonth )
			{
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				switch (empCheck) {
					case 1:
						dailyHours = fullDayHour;
						break;
					case 2:
						dailyHours = fullDayHour / 2;
						break;
					default:
						dailyHours = 0;
						break;
				}
				hours += dailyHours;
				day++;
				dailyWage = wagePerHour * dailyHours;
				monthlyWage += dailyWage;
				System.out.println("day: "+day+ " dailyhrs "+dailyHours+" dailyWages "+dailyWage);
				
	      }
			System.out.println("Monthly Wage of "+companyName+" is: "+monthlyWage);
		}
	public static void main(String args[])
	{
		EmpWage.empwage();
		EmpWage c1=new EmpWage("jio",24,8,123,20);
		c1.CompnayWage(); 
		EmpWage c2=new EmpWage("amazon",24,8,123,20);
		c1.CompnayWage();
	
		}
	}