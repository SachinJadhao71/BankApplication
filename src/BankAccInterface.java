public interface BankAccInterface {
    public String fetchBalance(String passWord);

    public double addMoney(int amount);

    public String withDrawMoney(String passward,int amount);

    public String ChangePassword(String newPassward, String oldpassword);

    public double checkInterest(int years);
}
