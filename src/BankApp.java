import com.biancasleonardo.bank.Client;
import com.biancasleonardo.bank.CurrentAccount;
import com.biancasleonardo.bank.SavingsAccount;

public class BankApp {
    public static void main(String[] args) throws Exception {

        Client client = new Client();
        client.setName("Bianca Leonardo");
        client.setEmail("biancasleonardo@gmail.com");
        client.setCPF("11111111111");
        client.setPhone("21999999999");

        CurrentAccount curreAccount = new CurrentAccount(client);

        SavingsAccount savingsAccount = new SavingsAccount(client);

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
