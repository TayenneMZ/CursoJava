package Exercicios.Heranca.ExercicioAbstrato.Entities;

public class LegalPerson extends Person {
    private Integer employeeNumber;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, double annualIncome, Integer employeeNumber) {
        super(name, annualIncome);
        this.employeeNumber = employeeNumber;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public double tax() {
        if (employeeNumber > 10) {
            return super.getAnnualIncome() * 0.14;
        } else {
            return super.getAnnualIncome() * 0.16;
        }
    }
}
