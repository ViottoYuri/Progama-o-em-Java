public class TestaPlacar {
    public static void main(String[] args){

        Placar jogo1 = new Placar("FACEF", "FDF");

        jogo1.RegistrarPontos(2, "casa");
        jogo1.RegistrarPontos(3, "visitante");

        jogo1.proximoQuarto();

        System.out.println(jogo1);
    }
}