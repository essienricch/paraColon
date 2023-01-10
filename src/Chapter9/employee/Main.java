package Chapter9.employee;

public class Main {
    public static void main(String[] args) {
        try {
            BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob","Lewis","333-33-3333",0.4,5000.00,300);
            CommissionEmployee commissionEmployee = new CommissionEmployee("Sue","Jones","222-22-2222",0.6,10000.0);
            System.out.println(commissionEmployee.toString());
            System.out.println();
            System.out.println(basePlusCommissionEmployee.toString());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());

        }

    }
}
