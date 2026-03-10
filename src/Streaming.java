public class Streaming {
    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    //construtor
    public Streaming(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;
        if (plano.equalsIgnoreCase("Básico")){
            this.mensalidade = 25.90f;
        }
        else if(plano.equalsIgnoreCase("Premium")){
            this.mensalidade = 45.90f;
        }else if(plano.equalsIgnoreCase("Família")){
            this.mensalidade = 60.90f;
        };
        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    public void assistirFilme(String nomeFilme){
        if (this.ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + this.ultimoFilmeAssistido);
        }
        else {
            System.out.println("Conta inativa, é necessário pagar sua fatura!");
        }
        }

    public void cancelarAssinatura(){
        if (this.ativo){
            this.ativo = false;
        }
    }

    public String toString(){
        String ativo;

        if(this.ativo){
            ativo = "Ativo";
        }else{
            ativo = "Suspenso";
        };
        return "usuario: " + this.usuario +
                "plano: " + this.plano +
                "mensalidade: " + this.mensalidade +
                "ativo: " + this.ativo +
                "ultimoFilmeAssistido: " + this.ultimoFilmeAssistido;
    }
}
