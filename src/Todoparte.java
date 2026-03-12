import java.util.Date;

public class Todoparte {
    public static void main(String[] args){
        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente(1, "Fulano", "124", "234567");

        pedido ped1 = new pedido(10, new Date(), cl2);
        System.out.println(ped1.toString());
    }
}
