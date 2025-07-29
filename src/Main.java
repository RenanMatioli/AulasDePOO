public class Main {

    public static void main(String[] args) {
        //Caneta 1
        Caneta C1 = new Caneta();
        C1.modelo = "Bic";
        C1.cor = "Azul";
        C1.ponta = 0.5f;
        C1.carga = 90;
        C1.destampar();
        C1.status();
        C1.rabiscar();

        System.out.println("====================================================");

        // caneta2
        Caneta C2 = new Caneta();
        C2.modelo = "compactor";
        C2.cor = "Vermelha";
        C2.ponta = 1.0f;
        C2.carga = 75;
        C2.tampar();
        C2.status();
        C2.rabiscar();


    }
}