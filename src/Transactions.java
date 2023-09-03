

//interface for Account class
public interface Transactions {

   // double minAmount = 100.d; //minimum for any transactions is $100

    // transaction methods
    void depostie(double amount);
    void withdraw(double amount);
    void transfer(Account a, double amount);
    void accountDetails();
}
