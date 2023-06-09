import java.util.UUID;

public class SBIBankAccount implements BankAccInterface{

    private String name;
    private String accountNo;

    private double balance;

    private String password;

    final double interestRate = 7.2;

    public SBIBankAccount() {

    }

    public SBIBankAccount(String name, double balance, String password) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String fetchBalance(String passWord) {
        return null;
    }

    @Override
    public double addMoney(int amount) {
        return 0;
    }

    @Override
    public String withDrawMoney(String passward, int amount) {
        return null;
    }

    @Override
    public String ChangePassword(String newPassward, String oldpassword) {
        return null;
    }

    @Override
    public double checkInterest(int years) {
        return 0;
    }
}
