import com.biancasleonardo.bank.CurrentAccount;
import com.biancasleonardo.bank.SavingsAccount;

public class BankApp {
    public static void main(String[] args) throws Exception {

        CurrentAccount curreAccount = new CurrentAccount();

        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.printStatement();
        curreAccount.printStatement();

        curreAccount.deposit(500.00);
        curreAccount.printStatement();

        curreAccount.withdraw(30.00);
        curreAccount.printStatement();

        curreAccount.transfer(50.00, savingsAccount);
        curreAccount.printStatement();
        savingsAccount.printStatement();
    }
}
