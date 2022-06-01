

public class Main {

    public static void main(String[] args) {

        // Punto I
        var numeroif = -5;
                if (numeroif == 0) {
                    System.out.println("Es numero no es negativo ni positivo");
                } else if (numeroif > 0) {
                    System.out.println("Este numero es positivo");
                } else if (numeroif < 0) {
                    System.out.println("Este numero es negativo");
                }



        // Punto II
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(+ numeroWhile);
            numeroWhile = numeroWhile + 1;
        }



        // Punto III

        int numeroWhile2 = 5;

        do {
            System.out.println(numeroWhile2);
            numeroWhile2 = numeroWhile2 - 3;
        } while(numeroWhile2 > 5);



        // Punto IV

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("La variable numeroFor ahora vale: " + numeroFor);
        }



        // Punto V
        var estacion = "otoño";

        switch (estacion) {
            case "verano":
                System.out.println("La estacion en la que se encuentra es " + estacion);
                break;
            case "invierno":
                System.out.println("La estacion en la que se encuentra es " + estacion);
                break;
            case "otoño":
                System.out.println("La estacion en la que se encuentra es " + estacion);
                break;
            case "primavera":
                System.out.println("La estacion en la que se encuentra es " + estacion);
                break;
            default:
                System.out.println("Indicacion que es un default");
        }
    }
}