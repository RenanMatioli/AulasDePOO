public class Caneta {

    String Modelo;
    String Cor;
    int Carga;
    Boolean Tampada;
    Float Ponta;

    void Status(){
        System.out.println("Esta é uma caneta modelo: " + this.Modelo);
        System.out.println("Sua cor é: " +  this.Cor);
        System.out.println("Sua ponta é: " + this.Ponta);
        System.out.println("Esta com " + this.Carga + "% de carga");
        System.out.println("ela esta tampada ? " + this.Tampada);
    }

    void Destampar(){
        this.Tampada = false;
    }

    void Tampar(){
        this.Tampada = true;
    }

    void Rabiscar(){
        if (this.Tampada == true){
            System.out.println("ERRO! Não é possivel rabiscar!");
        } else{
            System.out.println("Estou rabiscando");
        }

    }
}
