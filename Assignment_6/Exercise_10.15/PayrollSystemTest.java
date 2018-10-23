public class PayrollSystemTest{
    public static void main(String[] args){

        // create four element Employee array
        Employee[] employees = new Employee[5];

        // initialise array with Employees
        employees[0] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.0f);
        employees[1] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75f, 40.0f);
        employees[2] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000.0f, .06f);
        employees[3] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000.0f, .04f, 300.0f);
        employees[4] = new PieceWorker("Greg", "Stevenson", "555-55-5555", 20.25f, 52.0f);

        System.out.println("Employees processed polymorphically:\n");

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);

            // determine whether element is a BasePlusCommissionEmployee
            if(currentEmployee instanceof BasePlusCommissionEmployee){
                // downcase Employee reference to
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10f * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary());


            }

            double earned = currentEmployee.earnings();
            System.out.printf("Earnings: $%.2f%n%n", earned);
        }

        // get type name of each object in employee array
        for(int j=0; j<employees.length; j++){
            System.out.printf("Employee %d is a %s\n", j, employees[j].getClass().getName());
        }
    }
}