
public class Main {
    public static void main(String[] args) {
      HDFCBankAccount hdfcBankAccount = new HDFCBankAccount("sachin",1000,"sachin7171");

      System.out.println("Hello Mr " + hdfcBankAccount.getName() + " you have successfully created account in HDFC bank with account No :" + hdfcBankAccount.getAccountNo());

      hdfcBankAccount.addMoney(10000);

        System.out.println(hdfcBankAccount.fetchBalance("sachin7171"));

        System.out.println(hdfcBankAccount.withDrawMoney("sachin7171",2000));

        System.out.println(hdfcBankAccount.ChangePassword("jadhao","sachin7172"));

        System.out.println();

        System.out.println(hdfcBankAccount.ChangePassword("jadhao","sachin7171"));

        System.out.println();
        System.out.println(hdfcBankAccount.checkInterest(6));
    }
}