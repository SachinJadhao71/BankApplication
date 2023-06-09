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
        if(this.password.equals(passWord)){
            return "Your Current Balance Is : " + this.balance;
        }
        return "PassWord did not matched";
    }

    @Override
    public double addMoney(int amount) {
        this.balance += amount;

        return this.balance;
    }

    @Override
    public String withDrawMoney(String passward, int amount) {
        if(this.password.equals(password)){
            if(amount <= this.balance){
                this.balance -= amount;
                return "Your Money Has Been WithDrawn !! And your remaining balance is " + this.balance;
            }
            else{
                return "Insufficient balance";
            }
        }

        else {
            return "Incorrect passWord";
        }
    }

    @Override
    public String ChangePassword(String newPassward, String oldpassword) {
        if(this.password.equals(oldpassword)){
            this.password = newPassward;
            return "your passWord has been changed successfully";
        }
        return "Old PassWord did not matched";
    }

    @Override
    public double checkInterest(int years) {
        return (years * interestRate * this.balance) /100;
    }
}
