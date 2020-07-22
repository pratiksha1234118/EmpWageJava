public  class EmpWage implements ICompanyEmpWage {

	 private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWage(){
	companyEmpWageArray = new CompanyEmpWage[5];
	}

	 public void addCompanyEmpWage(String company, int empRatePerHr, int 
					numWorkingDays, int maxHrInMonth){
 
	companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHr, numWorkingDays, maxHrInMonth);
	numOfCompany++;
       }

public void employeeWage(){
	for(int i=0; i<numOfCompany; i++){
	    companyEmpWageArray[i].setTotalEmpWage(this.employeeWage(companyEmpWageArray[i]));
	System.out.println(companyEmpWageArray[i]);
	}
	}
	public int employeeWage(CompanyEmpWage companyEmpWage){
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
		ICompanyEmpWage i1= new EmpWage();
  
	i1.addCompanyEmpWage("jio",30,20,100);
    i1.addCompanyEmpWage("amazon",25,24,80);
	i1.employeeWage();

	}
}
