public class Placar {
    public String nomeTimeC;
    public String nomeTimeV;
    public int pontosC;
    public int pontosV;
    public int periodoQuarto;

    //Construtor
    public Placar(String nomeTimeC, String nomeTimeV) {
        this.nomeTimeC = nomeTimeC;
        this.nomeTimeV = nomeTimeV;
        this.pontosC = 0;
        this.pontosV = 0;
        this.periodoQuarto = 1;
    }

        //metodos
        public void RegistrarPontos(int tipo, String time) {
            if(time.equalsIgnoreCase("casa")) {
                this.pontosC += tipo;
                System.out.println("Time da casa (" + this.nomeTimeC + ") pontuou!");
            } else {
                this.pontosV += tipo;
                System.out.println("Time visitante (" + this.nomeTimeV + ") pontuou!");
            }
        }

            public void proximoQuarto(){
                if(periodoQuarto < 4){
                    this.periodoQuarto++;
                }else{
                    System.out.println("O jogo já terminou.");
                }
            }

            public String toString(){
                return nomeTimeC + "[" + pontosC + "] X [" + pontosV + "]" + nomeTimeV + " - Periodo: " + periodoQuarto;
            }
}
