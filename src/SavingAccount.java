public class SavingAccount extends Account{

    private double interest_rate;
    FileIO f = new FileIO();

    public SavingAccount (int accountNum, double balance, double interestRate) {
        super(accountNum, balance);
        this.interest_rate = interestRate;
    }

    public double getInterest_rate() {
        return interest_rate;
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
    }

    @Override
    public void accountDetails() {
        System.out.println("account name: " + getAccountNum());
        System.out.println("account number: " + getAccountNum());
        System.out.println("account balance: " + getBalance());
    }
}
