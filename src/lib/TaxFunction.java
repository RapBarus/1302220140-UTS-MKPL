package lib;

public class TaxFunction {

    public static int calculateTax(TaxableIncomeProfile profile) {
    int taxableIncome = ((profile.getMonthlySalary() + profile.getOtherMonthlyIncome()) * profile.getMonthsWorked()) 
                        - profile.getDeductible();

    int nonTaxable = 54000000;
    if (profile.isMarried()) nonTaxable += 4500000;
    nonTaxable += 4500000 * profile.getNumberOfChildren();

    int result = (int) Math.round(0.05 * (taxableIncome - nonTaxable));
    return Math.max(result, 0);
	}

}

