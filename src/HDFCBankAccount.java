import java.util.UUID;

public class HDFCBankAccount implements BankAccInterface{

    private String name;
    private String accountNo;
    private double balance;

    private String password;

    final double interest = 6.3;

    public HDFCBankAccount() {
    }

    public HDFCBankAccount(String name, double balance, String password) {
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
            return "your current balance is :" + balance;
        }
        return "Incorrect Password, Please enter correct password";
    }

    @Override
    public double addMoney(int amount) {
        this.balance += amount;
        return balance;
    }

    @Override
    public String withDrawMoney(String passward, int amount) {
        if(this.password.equals(password)){
            if(amount <= this.balance){
                this.balance -= amount;
                return "your money has been withdrawn" + amount + "Your Remaining balance is" + balance;
            }
            else{
                return "Insufficient balance";
            }
        }

        return "Incorect PassWord";
    }

    @Override
    public String ChangePassword(String newPassward, String oldpassword) {
        if(this.password.equals(oldpassword)){
            this.password = newPassward;
            return "your passWord change successFully !!";
        }
        return "Password does not matched";
    }

    @Override
    public double checkInterest(int years) {
         return (this.balance * interest * years)/100;
    }
}
