import java.util.ArrayList;

public  class EmpWage implements ICompanyEmpWage {

	 private int numOfCompany=0;
	private ArrayList <CompanyEmpWage> companyEmpWageList;
	public EmpWage(){
		companyEmpWageList=new ArrayList<>();
	}

	 public void addCompanyEmpWage(String company, int empRatePerHr, int 
					numWorkingDays, int maxHrInMonth){
 
	CompanyEmpWage companyEmpWage= new CompanyEmpWage(company, empRatePerHr, numWorkingDays, maxHrInMonth);
		 
		 companyEmpWageList.add(companyEmpWage);
	numOfCompany++;
       }

public void employeeWage(){
	for(int i=0; i<companyEmpWageList.size(); i++){
		CompanyEmpWage companyEmpWage =companyEmpWageList.get(i);
	    companyEmpWage.setTotalEmpWage(this.employeeWage(companyEmpWage));
	System.out.println(companyEmpWage);
	}
	}

	public int employeeWage(CompanyEmpWage companyEmpWage) 
	
	{
	int hour=0;
	int salary=0;
	int counter=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;

	while( totalEmpHrs < companyEmpWage.maxHrInMonth && totalWorkingDays < companyEmpWage.numWorkingDays){
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		counter+=1;
	totalWorkingDays+=1;

	switch(empCheck){
	case 1:
		hour=4;
		break;
	case 2:
		hour=8;
		break;
	default:
		hour=0;
	   }

	System.out.println("Day "+counter+"  Emp Hour= "+hour+" salary is: "+(companyEmpWage.empRatePerHr)*hour);
	totalEmpHrs = totalEmpHrs+hour;
	}

	return totalEmpHrs*companyEmpWage.empRatePerHr;
	//return totalSalary;

	}
		public static void main(String args[]){
			
			ICompanyEmpWage empWage = new EmpWage();
			empWage.addCompanyEmpWage("jio",30,20,100);
			empWage.employeeWage();
			empWage.addCompanyEmpWage("amazon",25,24,80);
			empWage.employeeWage();
	}
}
