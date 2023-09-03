
import java.util.Scanner;

public class main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); // option scanner
        Employee emp1 = new Employee("zhir Salahadin", "4896");

        Employee EmpArray[] = new Employee[30];
        EmpArray[0] = emp1;


        Customer cutomer = new Customer();

        Customer cst1 = new Customer("kewar", 1111);
        Customer cst2 = new Customer("prusha", 4632);
        Customer cst3 = new Customer("rand", 5632);

        Customer custArray[] = new Customer[30];
        custArray[0] = cst1;
        custArray[1] = cst2;
        custArray[2] = cst3;


        Bank bank = new Bank(custArray, EmpArray);
        bank.setCustomer(custArray);

        //FileIO file = new FileIO();


//        FileIO fw = new FileIO();
//        FileIO fr = new FileIO();

        Login login = new Login();
        login.LogIn();


        System.out.println("Welcome to our bank");

        int exception = 0;
        int decision = 0;

        while (true) {
            System.out.println("");
            System.out.println("user options");
            System.out.println("\t 1.Employee Management\t\t 2.Customer Management");
            System.out.println("\t 3.Customer Account management\t 4.Account Transactions");
            System.out.println("\t 5. Log Out");
            System.out.println("");

            while (true) {
                System.out.println("Enter your choice: ");
                Scanner input = new Scanner(System.in);
                try {
                    decision = input.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("please enter the the right number");
                    System.out.println("");
                }
            }

            switch (decision) {
                case (1): {
                    System.out.println("Options for employee Management");
                    System.out.println("\t 1.Instert new employee\t 2. remove existing employee\t 3.show all employee");
                    while (true) {
                        System.out.println("enter choice");
                        Scanner input = new Scanner(System.in);
                        try {
                            decision = input.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("please enter the right number");
                        }
                    }

                    switch (decision) {
                        case (1): {
                            String name = null;
                            String eId;

                            while (true) {
                                System.out.println("enter employee name");
                                Scanner input = new Scanner(System.in);
                                try {
                                    name = input.nextLine();
                                    break;
                                } catch (Exception e) {
                                    System.out.println("invalid input");
                                    System.out.println("");
                                }
                            }

                            while (true) {
                                System.out.println("enter employee ID");
                                Scanner input = new Scanner(System.in);
                                try {
                                    eId = input.nextLine();
                                    break;
                                } catch (Exception e) {
                                    System.out.println("invalid input");
                                    System.out.println("");
                                }
                            }

                            Employee insertEmployee = new Employee(name, eId);
                            bank.instertEmployee(insertEmployee);
                            break;
                        }
                        case (2): {
                            int removeEmployeeFlag = 0;
                            System.out.println("choose the emplpyee you want to remove");
                            String id = sc.nextLine();

                            for (int i = 0; i < bank.getEmployees().length; i++) {
                                if (bank.getEmployees()[i] != null) {
                                    if (bank.getEmployees()[i].getEID().equals(id)) {
                                        bank.deleteEmployee(bank.getEmployees()[i]);
                                        break;
                                    } else {
                                        removeEmployeeFlag++;
                                    }
                                } else if (bank.getEmployees()[i] == null) {
                                    removeEmployeeFlag++;
                                }
                            }
                            if (removeEmployeeFlag == bank.getEmployees().length) {
                                System.out.println("employee ID not matched");
                                break;
                            }
                            break;
                        }
                        case (3): {
                            bank.showAllEmployee();
                            break;
                        }
                        default:
                            System.out.println("wrong input");
                    }
                    break;
                }

                case (2): {
                    System.out.println("cutomer management options");
                    System.out.println("\t 1.insert new customer\t 2.remove customer\t 3.show all customers");
                    while (true) {
                        System.out.println("enter your choice");
                        Scanner input = new Scanner(System.in);
                        try {
                            decision = input.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("please enter the right number");
                            System.out.println("");
                        }
                    }
                    switch (decision) {
                        case (1): {
                            int nid = 0;
                            int managementCounter = 0;
                            while (true) {
                                System.out.println("enter customer ID");
                                Scanner input = new Scanner(System.in);
                                try {
                                    nid = input.nextInt();
                                    break;
                                } catch (Exception e) {
                                    System.out.println("enter the right number");
                                }
                            }
                            for (int i = 0; i < bank.getCustomer().length; i++) {
                                if (bank.getCustomer()[i] != null) {
                                    System.out.println("");
                                    System.out.println("customer found: " + bank.getCustomer()[i].getName());
                                    System.out.println("which type of account you want to create?\n1. saving account\t 2. normal account");
                                    while (true) {
                                        System.out.println("enter your choice");
                                        Scanner input = new Scanner(System.in);
                                        try {
                                            decision = input.nextInt();
                                            break;
                                        } catch (Exception e) {
                                            System.out.println("enter the right choice");
                                            System.out.println("");
                                        }
                                    }
                                    switch (decision) {
                                        case (1): {
                                            int accNum = 0;
                                            double amount = 0, interestRate = 0;
                                            while (true) {
                                                System.out.println("enter account number");
                                                Scanner input = new Scanner(System.in);
                                                try {
                                                    accNum = input.nextInt();
                                                    break;
                                                } catch (Exception e) {
                                                    System.out.println("enter the valid number");
                                                    System.out.println("");
                                                }
                                            }
                                            while (true) {
                                                System.out.println("enter the amount you want to deoposite");
                                                Scanner input = new Scanner(System.in);
                                                try {
                                                    amount = input.nextDouble();
                                                    break;
                                                } catch (Exception e) {
                                                    System.out.println("enter a valid decimal number");
                                                    System.out.println("");
                                                }
                                            }
                                            while (true) {
                                                System.out.println("enter the interest rate");
                                                Scanner input = new Scanner(System.in);
                                                try {
                                                    interestRate = input.nextDouble();
                                                    break;
                                                } catch (Exception e) {
                                                    System.out.println("please enter the valid decimal number");
                                                    System.out.println("");
                                                }
                                            }
                                            Account savingAccount = new SavingAccount(accNum, amount, interestRate);
                                            bank.getCustomer()[i].insertAccount(savingAccount);
                                            break;
                                        }

                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        case (3): {
                            String name = null;
                            int nid = 0;
                            while (true) {
                                System.out.println("enter customer name");
                                Scanner input = new Scanner(System.in);
                                try {
                                    name = input.nextLine();
                                    break;
                                } catch (Exception e) {
                                    System.out.println("invalid inpput");
                                    System.out.println("");
                                }
                            }

                            while (true) {
                                System.out.println("enter customer ID: ");
                                Scanner input = new Scanner(System.in);
                                try {
                                    nid = input.nextInt();
                                    break;
                                } catch (Exception e) {
                                    System.out.println("invalid input");
                                    System.out.println("");
                                }
                            }

                            Customer insertCustomer = new Customer(name, nid);
                            bank.insertCustomer(insertCustomer);
                            System.out.println("customer inserted successfully");
                            break;
                        }
                        case (2): {
                            int removeCustomerFlag = 0;
                            int nid = 0;
                            while (true) {
                                Scanner input = new Scanner(System.in);
                                System.out.println("choose customer you want to delete: ");
                                try {
                                    nid = input.nextInt();
                                    break;
                                } catch (Exception e) {
                                    System.out.println("invalid input");
                                    System.out.println("");
                                }
                            }

                            for (int i = 0; i < bank.getCustomer().length; i++) {
                                if (bank.getCustomer()[i] != null) {
                                    if (bank.getCustomer()[i].getNid() == nid) {
                                        bank.removeCustomer(bank.getCustomer()[i]);
                                        break;
                                    } else if (bank.getCustomer()[i].getNid() != nid) {
                                        removeCustomerFlag++;
                                    }
                                } else if (bank.getCustomer()[i].getNid() != nid) {
                                    removeCustomerFlag++;
                                } else if (bank.getCustomer()[i] == null) {
                                    removeCustomerFlag++;
                                }
                            }
                            if (removeCustomerFlag == bank.getCustomer().length) {
                                System.out.println("NID is invalid");
                                break;
                            }
                            break;
                        }
                        case (4): {
                            bank.showCustomerDetail();

                            break;
                        }
                        default:
                            System.out.println("wrong input");

                    }
                    break;
                }

                case (3): {
                    int money = 0, insert;
                    System.out.println("options for account transaction");
                    System.out.println("\t 1.deposite Money\t 2.withdraw money\t 3.transfer money");
                    while (true) {
                        System.out.println("enter choice: ");
                        Scanner input = new Scanner(System.in);
                        try {
                            decision = input.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("please enter the right choice");
                            System.out.println();
                        }
                    }
                    switch (decision) {
                        case (1): {
                            Scanner input = new Scanner(System.in);
// here we wrote while condition to print this if this was correct
                            while (true) {
//this will print kust account information
                                System.out.println("bank account information");
// this will print the choices
                                System.out.println("select 1 for insert");
                                System.out.println("select 2 for Checking money");
                                System.out.println("select 3 for quit");
                                System.out.print("select the work type that you want to be performed:");
                                int choice = sc.nextInt();
// in here we used switch so when the user write the number of the choice that he/she want  it will execute that part

                                switch (choice) {
//here we have case number one
                                    case 1:
                                        System.out.print("Enter money to be inserted:");
                                        insert = input.nextInt();
                                        money +=insert;
                                        System.out.println("Your Money has been successfully inserted");
                                        System.out.println("");
// this break will end the case
                                        break;

                                    case 2:
                                        System.out.println("money : IQD " + money);
                                        System.out.println("");
                                        break;

                                    case 3:
                                        System.exit(0);
                                }
//                            int accNo = 0;
//                            String accName = null;
//                            double amt = 0d;
//                            boolean counter = false;
//                            while (true) {
//                                System.out.println("enter account number");
//                                Scanner input = new Scanner(System.in);
//                                try {
//                                    accNo = input.nextInt();
//                                    break;
//                                } catch (Exception e) {
//                                    System.out.println("invalid input");
//                                    System.out.println("");
//                                }
//                            }
//                            while (true) {
//                                System.out.println("enter account name");
//                                Scanner input = new Scanner(System.in);
//                                try {
//                                    accName = input.nextLine();
//
//
//                                    break;
//                                } catch (Exception e) {
//                                    System.out.println("invalid input");
//                                    System.out.println("");
//                                }
//                            }
//                            for (int i = 0; i < bank.getCustomer().length; i++) {
//                                if (counter == true) {
//                                    break;
//                                }
//                                if (bank.getCustomer() != null) {
//                                    for (int j = 0; j < bank.getCustomer()[i].getAccounts().length; j++) {
//                                        if (counter == true) {
//                                            break;
//                                        }
//                                        if (bank.getCustomer()[i].getAccounts()[j] != null) {
//                                            if (bank.getCustomer()[i].getNid() == accNo && bank.getCustomer()[i].getName().equals(accName)) {
//                                                System.out.println("accoutn found...");
//                                                System.out.println("name of the customer of the account: " + bank.getCustomer()[i].getName());
//                                                System.out.println("");
//                                                while (true) {
//                                                    System.out.println("enter the amount you want to deposite: ");
//                                                    Scanner input = new Scanner(System.in);
//                                                    try {
//                                                        amt = input.nextDouble();
//                                                        break;
//                                                    } catch (Exception e) {
//                                                        System.out.println("invalid input");
//                                                        System.out.println("");
//                                                    }
//                                                }
//
//                                                bank.getCustomer()[i].getAccounts()[j].depostie(amt);
//                                                counter = true;
//                                                break;
//                                            } else {
//
//                                            }
//                                        } else if (bank.getCustomer()[i].getAccounts()[j] == null) {
//
//                                        }
//                                    }
//                                } else if (bank.getCustomer()[i] != null) {
//
//                                }
//                            }
//                            if (counter == false) {
//                                System.out.println("name and account number not matched ");
//                            }
//                            break;

                            }
                        }
                        case (2): {
                            Scanner input = new Scanner(System.in);
// here we wrote while condition to print this if this was correct
                            while (true) {
//this will print kust account information
                                System.out.println("bank account information");
// this will print the choices
                                System.out.println("select 1 for withdraw");
                                System.out.println("select 2 for Checking money");
                                System.out.println("select 3 for quit");
                                System.out.print("select the work type that you want to be performed:");
                                int choice = input.nextInt();
// in here we used switch so when the user write the number of the choice that he/she want  it will execute that part
                                switch (choice) {
//here we have case number one
                                    case 1:
                                        System.out.print("Enter money to be withdrawn:");
                                        insert = input.nextInt();
                                        money -=insert;
                                        System.out.println("Your Money has been successfully withdrawn");
                                        System.out.println("");
// this break will end the case
                                        break;

                                    case 2:
                                        System.out.println("money : IQD " + money);
                                        System.out.println("");
                                        break;

                                    case 3:
                                        System.exit(0);
                                }
//                            int accNO = 0, nid = 0;
//                            String name;
//                            double amt = 0;
//                            boolean counter = false;
//                            while (true) {
//                                System.out.println("enter account number");
//                                Scanner input = new Scanner(System.in);
//                                try {
//                                    accNO = input.nextInt();
//                                    break;
//                                } catch (Exception e) {
//                                    System.out.println("invalid Input");
//                                    System.out.println("");
//                                }
//                            }
//                            while (true) {
//                                System.out.println("enter name");
//                                Scanner input = new Scanner(System.in);
//                                try {
//                                    name = input.nextLine();
//                                    break;
//                                } catch (Exception e) {
//                                    System.out.println("invalid input");
//                                    System.out.println("");
//                                }
//                            }
//                            for (int i = 0; i < bank.getCustomer().length; i++) {
//                                if (counter == true) {
//                                    break;
//                                }
//                                if (bank.getCustomer()[i] != null) {
//                                    for (int j = 0; j < bank.getCustomer()[i].getAccounts().length; j++) {
//                                        if (counter == true) {
//                                            break;
//                                        }
//                                        if (bank.getCustomer()[i].getAccounts()[j] != null) {
//                                            if (bank.getCustomer()[i].getAccounts()[j].getAccountNum() == accNO && bank.getCustomer()[i].getName().equals(name)) {
//                                                System.out.println("account found");
//                                                System.out.println("name of the customer account: " + bank.getCustomer()[i].getName());
//                                                System.out.println("");
//                                                while (true) {
//                                                    System.out.println("how much do you want to withdraw: ");
//                                                    Scanner input = new Scanner(System.in);
//                                                    try {
//                                                        amt = input.nextDouble();
//                                                        break;
//                                                    } catch (Exception e) {
//                                                        System.out.println("please enter the valid input");
//                                                        System.out.println("");
//                                                    }
//                                                }
//                                                bank.getCustomer()[i].getAccounts()[j].withdraw(amt);
//                                                counter = true;
//                                                break;
//                                            } else {
//
//                                            }
//                                        } else if (bank.getCustomer()[i].getAccounts()[j] == null) {
//
//                                        }
//                                    }
//                                } else if (bank.getCustomer()[i] != null) {
//
//                                }
//                            }
//                            if (counter == false) {
//                                System.out.println("NID and account number dont match");
//                            }
//                            //withdraw
//                            break;
                            }
                        }
                        case (3): {
//                            int accNo = 0;
//                            String name;
//                            double amt = 0, wAccNo = 0;
//                            boolean counter1 = false, counter2 = false;
//                            while (true) {
//                                System.out.println("enter Senders account number: ");
//                                Scanner input = new Scanner(System.in);
//                                try {
//                                    accNo = input.nextInt();
//                                    break;
//                                } catch (Exception e) {
//                                    System.out.println("invalid input");
//                                    System.out.println("");
//                                }
//                            }
//                            while (true) {
//                                System.out.println("enter name number: ");
//                                Scanner input = new Scanner(System.in);
//                                try {
//                                    name = input.nextLine();
//                                    break;
//                                } catch (Exception e) {
//                                    System.out.println("invalid input");
//                                    System.out.println("");
//                                }
//                            }
//                            for (int i = 0; i < bank.getCustomer().length; i++) {
//                                if (counter1 == true) {
//                                    break;
//                                }
//                                if (bank.getCustomer()[i] != null) {
//                                    for (int j = 0; j < bank.getCustomer()[i].getAccounts().length; j++) {
//                                        if (counter1 == true) {
//                                            break;
//                                        }
//                                        if (bank.getCustomer()[i].getAccounts()[j] != null) {
//                                            if (bank.getCustomer()[i].getAccounts()[j].getAccountNum() == accNo && bank.getCustomer()[i].getName().equals(name)) {
//                                                System.out.println("account found");
//                                                System.out.println("name of the account: " + bank.getCustomer()[i].getName());
//                                                counter1 = true;
//                                                System.out.println("");
//                                                while (true) {
//                                                    System.out.println("enter recievers account number: ");
//                                                    Scanner input = new Scanner(System.in);
//                                                    try {
//                                                        wAccNo = input.nextDouble();
//                                                        break;
//                                                    } catch (Exception e) {
//                                                        System.out.println("invalid input");
//                                                        System.out.println("");
//                                                    }
//                                                }
//                                                for (int k = 0; k < bank.getCustomer().length; k++) {
//                                                    if (counter2 == true) {
//                                                        break;
//                                                    }
//                                                    if (bank.getCustomer()[k] != null) {
//                                                        for (int l = 0; l < bank.getCustomer()[k].getAccounts().length; l++) {
//                                                            if (counter2 == true) {
//                                                                break;
//                                                            }
//                                                            if (bank.getCustomer()[k].getAccounts()[l] != null) {
//                                                                if (bank.getCustomer()[k].getAccounts()[l].getAccountNum() == wAccNo) {
//                                                                    while (true) {
//                                                                        System.out.println("enter amount to transfer");
//                                                                        Scanner input = new Scanner(System.in);
//                                                                        try {
//                                                                            amt = input.nextDouble();
//                                                                            break;
//                                                                        } catch (Exception e) {
//                                                                            System.out.println("invalid input");
//                                                                            System.out.println("");
//                                                                        }
//                                                                    }
//                                                                    //System.out.println("amount " +amt+ " transferred from account " + bank.getCustomer()[i].getAccounts()[j].getAccountName()+ "to account "+bank.getCustomer()[i].getAccounts()[j].getAccountName()+" succefully");
//                                                                    System.out.println("Amount " + amt + " transferred from account No - " + bank.getCustomer()[i].getAccounts()[j].getAccountNum() + " to account no - " + bank.getCustomer()[i].getAccounts()[j].getAccountNum() + " successfully!");
//                                                                    bank.getCustomer()[i].getAccounts()[j].transfer(bank.getCustomer()[k].getAccounts()[l], amt);
//                                                                    counter2 = true;
//                                                                    break;
//                                                                } else {
//
//                                                                }
//                                                            } else if (bank.getCustomer()[k].getAccounts()[l] == null) {
//
//                                                            }
//                                                        }
//                                                    } else if (bank.getCustomer()[k] == null) {
//
//                                                    }
//                                                }
//                                                if (counter2 == false) {
//                                                    System.out.println("reciever account not found");
//                                                    break;
//                                                }
//                                            } else {
//
//                                            }
//                                        } else if (bank.getCustomer()[i].getAccounts()[j] == null) {
//
//                                        }
//                                    }
//                                } else if (bank.getCustomer()[i] != null) {
//
//                                }
//                            }
//                            if (counter1 == false) {
//                                System.out.println("sender account not found");
//                            }
//                            break;
//                        }
//                    }

                        }
                        case (4): {
                            FileIO f = new FileIO();
                            System.out.println("");
                            System.out.println("transaction history");
                            System.out.println("");
                            f.readFromFile();
                            System.out.println("");
                            break;
                        }


                        case (5): {
                            System.out.println("logged out succesfully ");
                            System.exit(0);
                        }
                        default:
                            System.out.println("invalid input");
                            break;
                    }
                }
            }
        }
    }
}