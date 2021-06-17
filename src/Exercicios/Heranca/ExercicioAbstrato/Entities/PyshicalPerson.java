package Exercicios.Heranca.ExercicioAbstrato.Entities;

public class PyshicalPerson extends Person {
    private Double heathSpending;

    public PyshicalPerson() {
        super();
    }

    public PyshicalPerson(String name, double annualIncome, Double heathSpending) {
        super(name, annualIncome);
        this.heathSpending = heathSpending;
    }

    public Double getHeathSpending() {
        return heathSpending;
    }

    public void setHeathSpending(Double heathSpending) {
        this.heathSpending = heathSpending;
    }

    @Override
    public double tax() {
        if (super.getAnnualIncome() < 20000.00) {
            return super.getAnnualIncome() * 0.15;
        } else {
            if (heathSpending != 0) {
                return (super.getAnnualIncome() * 0.25) - (heathSpending * 0.5);
            } else {
                return super.getAnnualIncome() * 0.25;
            }
        }
    }
}
