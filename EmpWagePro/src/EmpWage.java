  public class EmpWage {
	private static String companyName;
	private static int wagePerHour;
	private static int fullDayHour;
	private static int totalHours;
	private static int dayPerMonth;
	private static int monthlyWage;

	EmpWage( String companyName, int wagePerHour, int fullDayHour, int totalHours, int dayPerMonth) {
		this.companyName=companyName;
		this.wagePerHour = wagePerHour;
		this.fullDayHour = fullDayHour;
		this.totalHours = totalHours;
		this.dayPerMonth = dayPerMonth;
	}
	
		private static void CompnayWage() {
			//variable
			int dailyHours;
			int dailyWage = 0;
			int hours = 0;
			int day = 0;
			//computation
			while ( hours <= totalHours && day < dayPerMonth )
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
				dailyWage= wagePerHour * dailyHours;
				monthlyWage += dailyWage;
				//System.out.println("day: "+day+ " dailyhrs "+dailyHours+" dailyWages "+dailyWage);
				
	      }
			//System.out.println("Monthly Wage of "+companyName+" is: "+monthlyWage);
		}
		
		@Override
		public String toString()
		{
			return "total employee wages of company" +companyName+ " is " +monthlyWage;
		}
	public static void main(String args[])
	{
		
		EmpWage c1=new EmpWage("jio",24,8,123,20);
		c1.CompnayWage();
		System.out.println(c1);
		EmpWage c2=new EmpWage("amazon",24,8,123,20);
		c2.CompnayWage();
		System.out.println(c2);
		}
	}