public class TestaCarro {
    public static void main(String[] args){
        //new Carro chama o contrutor
        Carro obj1 = new Carro("Fiat"  , "Uno" , 0 , false);
        System.out.println(obj1);
        obj1.Ligar();
        obj1.acelerar(100); // acelera em 100 o carro
        obj1.freiar(40); // diminui em 40 a velocidade
        System.out.println(obj1.toString());

        // chama o metodo construtor
        Carro obj2 = new Carro("MG" , "Onix" , 0 , false);
        System.out.println(obj2);
        obj2.Ligar();
        obj2.acelerar(80);
        obj2.freiar(60);
        obj2.freiar(40); // O carro segue em 20 pois fica 20 - 40 e não diminui
        System.out.println(obj2.toString());

        //ao encerrar
        obj1.Desligar();
        obj2.Desligar();

    }
}