public class Main {

    public static void main(String[] args) {
        //Caneta 1
        Caneta C1 = new Caneta();
        C1.Modelo = "Bic";
        C1.Cor = "Azul";
        C1.Ponta = 0.5f;
        C1.Carga = 90;
        C1.Destampar();
        C1.Status();
        C1.Rabiscar();

        System.out.println("====================================================");

        // caneta2
        Caneta C2 = new Caneta();
        C2.Modelo = "compactor";
        C2.Cor = "Vermelha";
        C2.Ponta = 1.0f;
        C2.Carga = 75;
        C2.Tampar();
        C2.Status();
        C2.Rabiscar();


    }
}