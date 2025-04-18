package lib;

public class TaxableIncomeProfile {
    private final int monthlySalary;
    private final int otherMonthlyIncome;
    private final int monthsWorked;
    private final int deductible;
    private final boolean isMarried;
    private final int numberOfChildren;

    public TaxableIncomeProfile(int monthlySalary, int otherMonthlyIncome, int monthsWorked,
                                int deductible, boolean isMarried, int numberOfChildren) {
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.monthsWorked = monthsWorked;
        this.deductible = deductible;
        this.isMarried = isMarried;
        this.numberOfChildren = Math.min(numberOfChildren, 3); // batas 3 anak
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public int getMonthsWorked() {
        return monthsWorked;
    }

    public int getDeductible() {
        return deductible;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }
}
