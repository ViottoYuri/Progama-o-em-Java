public class TestaStreaming {
    public static void main(String[] args){
        Streaming Conta1 = new Streaming("Yuri", "PREMIUM");
            Conta1.assistirFilme ("Harry Potter");
            System.out.println(Conta1);

        Conta1.cancelarAssinatura();
        Conta1.assistirFilme("Matrix");

        System.out.println(Conta1);
    }
}
