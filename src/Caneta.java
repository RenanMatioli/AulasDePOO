public class Caneta {

    public String modelo;
    public String cor;
    protected int carga;
    protected Boolean tampada;
    private Float ponta;

    void status(){
        System.out.println("Esta é uma caneta modelo: " + this.modelo);
        System.out.println("Sua cor é: " +  this.cor);
        System.out.println("Sua ponta é: " + this.ponta);
        System.out.println("Esta com " + this.carga + "% de carga");
        System.out.println("ela esta tampada ? " + this.tampada);
    }

    void destampar(){
        this.tampada = false;
    }

    void tampar(){
        this.tampada = true;
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não é possivel rabiscar!");
        } else{
            System.out.println("Estou rabiscando");
        }

    }
}
