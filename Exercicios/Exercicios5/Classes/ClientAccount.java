package Classes;

// Eu sei que um registro de um banco e um código real de um banco não seria assim, mas estou fazendo assim porque o curso pediu
public class ClientAccount {
    
    private float Saldo = 0;
    private final number withDrawTax = 5;

    public String nomeDoTitular;
    private int numeroDaConta;
    private float depositoInicial = 0;

    public Banco(int numeroDaConta, String nomeDoTitular){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }
    
    public Banco(int numeroDaConta, String nomeDoTitular, float depositoInicial){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.depositoInicial = depositoInicial;

        this.deposito(depositoInicial);
    }

    //-------Getters----------
        public float getDepositoInicial(){
            return depositoInicial;
        }
        public int getNumeroDaConta(){
            return numeroDaConta;
        }
        public float getSaldo() {
            return Saldo;
        }

    //------Setters----------
        public void setDepositoInicial(float depositoInicial){
            this.depositoInicial = depositoInicial;
        }
        public void setNumeroDaConta(int numeroDaConta){
            this.numeroDaConta = numeroDaConta;
        }

    //---Metodos---

    public float deposito(float valor){
        
        this.Saldo = this.Saldo + valor;
        
        return Saldo;
    }
    public float Saque(float valor){
        
        this.Saldo = this.Saldo - valor - this.withDrawTax;
        
        return Saldo;
    }

    //
}
