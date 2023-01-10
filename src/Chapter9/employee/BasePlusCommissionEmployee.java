package Chapter9.employee;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, commissionRate, grossSales);
        if (baseSalary < 0.0){
           throw new IllegalArgumentException("Salary must be greater than 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0){
            throw new IllegalArgumentException("Salary must be greater than 0.0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s%s%s%s%n%s%s%n%s%.1f%n%s%.2f%n%s%.2f%n%s%.2f%n", "Commission Employee: " , getFirstName() , ", " , getLastName() , "Social Security Number: " , getSocialSecurityNumber() , "Commission Rate: " , getCommissionRate() , "Gross sales: " , getGrossSales(), "Base Salary: ", baseSalary,"Earning: ",earnings());
    }
}
