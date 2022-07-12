public class coche {

    public static void main(String[] args) {
        numeroPuertas miCoche = new numeroPuertas();
        miCoche.SumarPuerta();

        System.out.println(miCoche.puertas);
    }
}

class numeroPuertas {
    public int puertas = 0;

    public void SumarPuerta() {
        this.puertas++;
    }
}