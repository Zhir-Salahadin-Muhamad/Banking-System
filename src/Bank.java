import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Bank implements CustomerOP, EmployeeOP{
    private Customer [] customer;
    private Employee [] employees;


    public Bank(Customer[] customer, Employee[] empArray) {
        this.employees = empArray;
        this.customer = customer;
    }

    public Customer[] setCustomer(Customer[] custArray) {
        this.customer = customer;
        return customer;
    }
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {

        return employees;
    }

    public Customer[] getCustomer() {
//        for (int i=0; i< customer.length; i++) {
//            customer[i].getName();
//            customer[i].getNid();
//        }

        return customer;
    }


    @Override
    public void insertCustomer(Customer c) {
        for (int i=0; i<= customer.length;i++) {
            if (customer[i] == null){
                customer[i]=c;
                System.out.println("new customer insterted" );
                break;
            }
        }


    }

    @Override
    public void removeCustomer(Customer c) {
        for (int i=0; i< customer.length;i++) {
            if (customer[i] == c) {
                customer[i] = null;
                System.out.println("customer removed");
                break;
            }
        }

        }

    @Override
    public void showCustomerDetail() {
        for (int i=0;i < customer.length; i++) {
            if (customer[i] != null) {
                System.out.println("customer name: " + customer[i].getName());
                System.out.println("customer ID: " + customer[i].getNid());
                NumberFormat fmt = NumberFormat.getCurrencyInstance();
                //DecimalFormat fmt2 = new DecimalFormat("0.##");

                System.out.println("customer balance: " +fmt.format(customer[i].getBalance()));
            }
        }

    }

    @Override
    public void instertEmployee(Employee e) {
        for (int i=0; i<employees.length; i++){
            if(employees[i] == null) {
                employees[i] = e;
                System.out.println("new customer inserted");
            }
        }
    }

    @Override
    public void deleteEmployee(Employee e) {
        for (int i=0; i<employees.length; i++) {
            if(employees[i] == e) {
                employees[i] = null;
                System.out.println("employee removed");
            }
        }
    }

    @Override
    public void showAllEmployee() {
        for (int i=0; i<employees.length; i++) {
            if(employees[i] != null) {
                System.out.println("employee name: " +employees[i].getName());
                System.out.println("employee ID: " + employees[i].getEID());
            }
        }
        System.out.println("");
    }
}
