public class Customer extends Account implements AccountOP{
    private String name;
    private int nid;

    private Account accounts [] = new Account[2];
    public Customer(String name, int nid) {
        this.name = name;
        this.nid = nid;
    }

    FileIO f = new FileIO();
    public Customer(int accountNum, String accountName, double balance) {
        super(accountNum, accountName, balance);
    }

    public Customer(){

    }

//    @Override
//    public void showDetails() {
//
//    }

    public String getName() {

        return name;
    }
    public int getNid() {
        return nid;
    }

    public Account[]  getAccounts() {

        return accounts;
    }

    @Override
    public void depostie(double amount) {
        String str1 = "amount before deposite: " + super.balance;
        super.balance +=amount;
        String str2 = "amount deposited: " + amount;
        String str3 = "full balance: " + super.balance;
        f.WriteInFile("-------------------------");
        f.WriteInFile(str1+ "\n" + str2+ "\n" + str2);
        f.WriteInFile("-------------------------");



    }

    @Override
    public void withdraw(double amount) {

        if (super.balance >= amount) {
            String str1 = "amount before withdraw " + super.balance;
            super.balance -=amount;
            String str2 = "amount deposited: " + amount;
            String str3 = "full balance: " +super.balance;

            f.WriteInFile("------------------------");
            f.WriteInFile(str1+"\n"+str2+"\n"+str3);
            f.WriteInFile("------------------------");
        }

        else {
            System.out.println("not enough balance");
        }

    }

    @Override
    public void transfer(Account a, double amount) {
        if (super.balance >= amount) {
            String str1 = "amount before transfer: " + super.balance;

            super.balance -= amount;
            a.balance += amount;
            String str2 = "amount tranfered" + amount + "from " + getAccountNum() + "to " + a.getAccountNum();
            String str3 = "balance of account: " + getAccountNum() + super.balance + "Blanace of account trasfered to: " +a.getBalance();

            f.WriteInFile("--------------------------");
            f.WriteInFile(str1+"\n"+str2+"\n"+str2);
            f.WriteInFile("--------------------------");
        }

        else {
            System.out.println("not enough balance");
        }

    }

    @Override
    public void accountDetails() {
        System.out.println("account name: " + getAccountName());
        System.out.println("account number: " + getAccountNum());
        System.out.println("account balance: " + getBalance());

    }

    @Override
    public void insertAccount(Account acc) {
        int counter=0;
        for(int i=0;i<accounts.length;i++) {
            if(accounts[i]==null) {
                accounts[i]=acc;
                System.out.println("New Account Inserted ...");
                break;
            }
            else if(accounts[i]!=null) {
                counter++;
            }
        }
        if(counter==accounts.length) {
            System.out.println("Account can not be inserted! One user can have only two accounts...");
        }
    }

    @Override
    public void removeAccount(Account acc) {
        for(int i=0;i<accounts.length;i++) {
            if(accounts[i]== acc){
                accounts[i]=null;
                System.out.println("Account Removed !");
                break;
            }

        }

    }

    @Override
    public void showAllAccounts(Account acc) {
        for(int i=0;i<accounts.length;i++) {
            if(accounts[i]!=null) {
                System.out.println("---------------------------------------------");
                accounts[i].accountDetails();
                System.out.println("---------------------------------------------");
            }
        }
        System.out.println("");
    }

}

