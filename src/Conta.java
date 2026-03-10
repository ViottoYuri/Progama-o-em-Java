public class Conta {

    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
        // sem o this, se pega os valores que o usuario digita e add ao obj
    }
    public void depositar(float x){
        if (this.status){
            this.saldo += x;
            System.out.println("Deposito feito, Saldo atual de: " + this.saldo);
        }
    }

    public void sacar(float y){
        if (this.status && this.saldo >= y){
            this.saldo -= y;
            System.out.println("Saque feito. Saldo atual de: " + this.saldo);
        }else {System.out.println("Saldo insuficiente ou conta inativa, favor validar junto a central de atendimento!");}
    }

    public void encerrarConta(){
        if(this.saldo == 0){
            this.status = false;
            System.out.println("Conta desativada");
        }else {System.out.println("Existe saldo em conta, favor realizar um sacar e zerar a conta para encerrar sua conta.");}
    }

    public String toString(){
        String ativo;
        if(this.status){
            ativo = "Ativa";
        }
        else{
            ativo = "Inativa";
        };
        return "Número da Conta: " + this.numeroConta + // O + significa que é visibilidade pública
                " Agência: " + this.agencia +
                " Nome do Cliente: " + this.nomeCliente +
                " Saldo: " + this.saldo +
                " Status da Conta: " + ativo;
    }
}

