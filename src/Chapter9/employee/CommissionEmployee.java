package Chapter9.employee;

public class CommissionEmployee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
       if (commissionRate <= 0.0 || commissionRate >= 1.0) {
           throw new IllegalArgumentException("Commission Rate must be greater than 0.0 and less than 1.0");
        }
       if (grossSales < 0.0){
           throw new IllegalArgumentException("Gross sales must be greater than 0.0");
       }
       this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission Rate must be greater than 0.0 and less than 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be greater than 0.0");
        }
        this.grossSales = grossSales;
    }

    public double earnings(){
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s%s%s%s%n%s%s%n%s%.1f%n%s%.2f%n%s%.2f", "Commission Employee: " , firstName , ", " , lastName , "Social Security Number: " , socialSecurityNumber , "Commission Rate: " , commissionRate , "Gross sales: " , grossSales, "Earning: ", earnings());
    }
}
