import Classes.Banco;
import java.util.Scanner;

public class IndexExercicio1{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number:");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the account holder:");
        String accountHolder = sc.next();
        sc.nextLine();

        System.out.println("Is there any initial deposit?(y/n)");
        String justACheck = sc.next();
        sc.nextLine();

        if(justACheck == "y" || justACheck == "Y"){ 
            System.out.println("Enter the initial deposit (with .):");
            float initialDeposit = sc.nextFloat();
            sc.nextLine();
            Banco Client = new Banco(accountNumber, accountHolder, initialDeposit);

            System.out.println("Account:" + Client.getNumeroDaConta() + "," + " Holder" + Client.nomeDoTitular + "," + " Balance: $ " + Client.getSaldo());
            
            // deposit
            System.out.println("Enter a deposit value:");
            float deposit = sc.nextFloat();
            Client.deposito(deposit);
            System.out.println("Updated account:" + Client.getNumeroDaConta() + "," + " Holder" + Client.nomeDoTitular + "," + " Balance: $ " + Client.getSaldo());

            // withdraw
            System.out.println("Enter a withdraw value");
            float withDraw = sc.nextFloat();
            Client.Saque(withDraw);
            System.out.println("Updated account:" + Client.getNumeroDaConta() + "," + " Holder" + Client.nomeDoTitular + "," + " Balance: $ " + Client.getSaldo());
        }

        if(justACheck == "n" || justACheck == "N"){
            // Eu sei que não tem sentido mas eu preciso fazer assim para fazer igual tá pedindo
            Banco Client = new Banco(accountNumber, accountHolder);
            System.out.println("Account:" + Client.getNumeroDaConta() + "," + " Holder" + Client.nomeDoTitular + "," + " Balance: $ " + Client.getSaldo());
        
            // deposit
            System.out.println("Enter a deposit value:");
            float deposit = sc.nextFloat();
            Client.deposito(deposit);
            System.out.println("Updated account:" + Client.getNumeroDaConta() + "," + " Holder" + Client.nomeDoTitular + "," + " Balance: $ " + Client.getSaldo());

            // withdraw
            System.out.println("Enter a withdraw value");
            float withDraw = sc.nextFloat();
            Client.Saque(withDraw);
            System.out.println("Updated account:" + Client.getNumeroDaConta() + "," + " Holder" + Client.nomeDoTitular + "," + " Balance: $ " + Client.getSaldo());
        }

        sc.close();
    }
}

