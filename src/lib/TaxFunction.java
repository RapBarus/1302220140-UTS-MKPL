package lib;

public class TaxFunction {

    public static int calculateTax(TaxableIncomeProfile profile) {
        int taxableIncome = calculateTaxableIncome(profile);
        int nonTaxableIncome = calculateNonTaxableIncome(profile);
        int rawTax = (int) Math.round(0.05 * (taxableIncome - nonTaxableIncome));
        return Math.max(rawTax, 0);
    }

    private static int calculateTaxableIncome(TaxableIncomeProfile profile) {
        return ((profile.getMonthlySalary() + profile.getOtherMonthlyIncome()) * profile.getMonthsWorked())
                - profile.getDeductible();
    }

    private static int calculateNonTaxableIncome(TaxableIncomeProfile profile) {
        int nonTaxable = 54000000;
        if (profile.isMarried()) nonTaxable += 4500000;
        nonTaxable += 4500000 * Math.min(profile.getNumberOfChildren(), 3);
        return nonTaxable;
    }

}

