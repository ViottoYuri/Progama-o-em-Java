public class TestaConta {
    public static void main(String[] args){
        Conta objc1 = new Conta(1000, 0001, "João Silva");{
            objc1.depositar(500);
            objc1.sacar(200);
            objc1.encerrarConta();
            objc1.sacar(300);
            objc1.encerrarConta();
            System.out.println(objc1.toString());
        }

        Conta objc2 = new Conta(2000, 0002, "Maria Souza");
            objc2.sacar(50);
            System.out.println(objc2.toString());
    }
}
