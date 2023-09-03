import java.text.DecimalFormat;

//Parent class
public abstract class Account implements Transactions {
    private int accountNum;
    private String accountName;
    protected double balance;

    public Account(int accountNum, String accountName, double balance) {
        this.accountNum = accountNum;
        this.accountName = accountName;
        this.balance = balance;

        DecimalFormat value = new DecimalFormat("0.##");

    }

            public Account() {

            }

    public Account(int accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void setAccountNum(int accountNum) {
                this.accountNum = accountNum;
            }

            public void setAccountName(String accountName) {
                this.accountName = accountName;
            }

            public void setBalance(double balance) {
                this.balance = balance;
            }

            public double getBalance() {
                return balance;
            }

            public int getAccountNum() {
                return accountNum;
            }

            public String getAccountName() {
                return accountName;
            }

           // public abstract void showDetails();
        }
