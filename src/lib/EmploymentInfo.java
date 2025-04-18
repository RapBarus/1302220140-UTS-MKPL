package lib;

import java.time.LocalDate;

public class EmploymentInfo {
    private final int yearJoined;
    private final int monthJoined;
    private final boolean isForeigner;
    private final Gender gender;
    private final Salary salary;
    private int annualDeductible;

    public EmploymentInfo(int yearJoined, int monthJoined, boolean isForeigner, Gender gender) {
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.isForeigner = isForeigner;
        this.gender = gender;
        this.salary = new Salary();
    }

    public void setBaseSalary(int baseSalary) {
        int adjusted = isForeigner ? (int) (baseSalary * 1.5) : baseSalary;
        salary.setBaseSalary(adjusted);
    }

    public void setAdditionalIncome(int income) {
        salary.setAdditionalIncome(income);
    }

    public void setAnnualDeductible(int deductible) {
        this.annualDeductible = deductible;
    }

    public Salary getSalary() {
        return salary;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }

    public int getMonthsWorkedThisYear() {
        LocalDate now = LocalDate.now();
        return (now.getYear() == yearJoined) ? now.getMonthValue() - monthJoined : 12;
    }
}
