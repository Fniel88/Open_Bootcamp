public class Main{
    /**
     * @param args
     */
    public static void main(String[] args) {
        var z = Suma(31, 23, 89);
        System.out.println(z);
    
        Coche miCoche = new Coche();
        miCoche.SumaPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int Suma(int a, int b, int c) {
        return a + b + c;
    }

class Coche {
    public int puertas = 0;

    public SumaPuertas() {
        this.puertas++;
    }
}
}