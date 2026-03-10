public class Basquete{
    public String nomeTimeC;
    public String nomeTimeV;
    public int pontosC;
    public int pontosV;
    public int periodoQuarto;

    //Construtor
    public Basquete(String nomeTimeC, String nomeTimeV){
        this.nomeTimeC = nomeTimeC;
        this.nomeTimeV = nomeTimeV;
        this.pontosC = 0;
        this.pontosV = 0;
        this.periodoQuarto = 1;

        //metodos
        public void RegistrarPontos(){
            if(this.pontosC == +1){
                this.pontosC++;
                System.out.println("Time da Casa pontuou.");
            }
        }


    }
}
