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
			System.out.println("day:"+totalWorkingDay+"Employeehrs"+empHrs+"employeeWages"+empWage);
			}
	totalWage=totalEmpHrs*empWagePerHr;
	System.out.println("total employee wgae"+totalWage);
	return totalWage;
	}
	public static void main(String args[])
	{
		EmpWage e1=new EmpWage();
		e1.empwage();
		}
	}
