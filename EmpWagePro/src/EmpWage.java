public class EmpWage {
	    public static void Attendance() {
		int emp=(int)(Math.random()*2);
		if(emp==1)
		{
			System.out.println("employee is present");
		}
		else
		{
			System.out.println("employee is absent");
		}
	    }
		public static void main(String args[])
		{
			Attendance();
		}
	}
