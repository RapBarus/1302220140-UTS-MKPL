package lib;

public class Employee {
    private final String employeeId;
    private final EmployeeInfo EmployeeInfo;
    private final FamilyInfo familyInfo;
    private final EmploymentInfo employmentInfo;

    public Employee(String employeeId, EmployeeInfo EmployeeInfo, EmploymentInfo employmentInfo) {
        this.employeeId = employeeId;
        this.EmployeeInfo = EmployeeInfo;
        this.familyInfo = new FamilyInfo();
        this.employmentInfo = employmentInfo;
    }

    public void setSpouse(Spouse spouse) {
        familyInfo.setSpouse(spouse);
    }

    public void addChild(Child child) {
        familyInfo.addChild(child);
    }

    public void setMonthlySalary(int salary) {
        employmentInfo.setBaseSalary(salary);
    }

    public void setAnnualDeductible(int deductible) {
        employmentInfo.setAnnualDeductible(deductible);
    }

    public void setAdditionalIncome(int income) {
        employmentInfo.setAdditionalIncome(income);
    }

    public int calculateAnnualTax() {
        return TaxFunction.calculateTax(
            employmentInfo.getSalary().getBaseSalary(),
            employmentInfo.getSalary().getAdditionalIncome(),
            employmentInfo.getMonthsWorkedThisYear(),
            employmentInfo.getAnnualDeductible(),
            familyInfo.hasSpouse(),
            familyInfo.getNumberOfChildren()
        );
    }
}
