import java.sql.SQLOutput;

public class Carro{
    // variaveis ou propriedades ou atributos
    public String marca, modelo; //string é um tipo de dado do tipo classe
    public float velocidade; //float é um tipo de dado primiktivo, se for maiusculol é
    public boolean motor; // boolean é um tipo de dadeo primitivo

    //Construtor | esse metodo possui o mesmo nome da classe
    public Carro(String marca, String modelo, float velocidade, boolean motor){ //passa os parametros do objeto
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
        // sem o this, se pega os valores que o usuario digita e add ao obj
    }

    //Ligar o Carro
    //
    public void Ligar(){ // void pois não irá retornar nada
        if(!this.motor){ // O ! significa "se for falso", significa not/não.
            this.motor = true;
        System.out.println("Motor Ligado");
        }
    };

    public void Desligar(){ // void pois não irá retornar nada
        if (this.motor){ // motor já é false
            this.motor = false;
            this.velocidade = 0;
            System.out.println("Motor Desligado");
        }
    };

    public void acelerar(float x){
        if(this.motor) {
            this.velocidade += x;
            System.out.println("Velocidade acelerada" + this.velocidade);
        };
    };

    public void freiar(float x){
        if(this.motor && this.velocidade - x >= 0){
            this.velocidade -= x;
            System.out.println("Velocidade diminuida" + this.velocidade);
        }
        else System.out.println("Não freou");
    };



    // metodo que coverte o obj em string.
    // this representa o obj que chama o metodo
    public String toString(){
        return "Marca: " + this.marca + // O + significa que é visibilidade pública
                "Modelo: " + this.modelo +
                "Velocidade: " + this.velocidade +
                "Motor: " + this.motor;
    }
}
