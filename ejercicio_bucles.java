
public class Main {
    public static void main(String[] args) {
        int numeroif = 0;
        if (numeroif > 0){
            System.out.println("Es un numero positivo");
        } else if (numeroif < 0){
            System.out.println("Es un numero negativo");
        } else
            System.out.println("El numero es igual a 0");

        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
        } while(numeroWhile < 3);
            numeroWhile++;

        for (int numeroFor = 0; numeroFor <= 3;numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion = "Otoño";

        switch (estacion){
            case "Primavera":
                System.out.println("Estmoes en Primavera");
                break;
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            default:
                System.out.println("No estamos en ninguna de las 4 estaciones");
                break;
        }
    }
}
