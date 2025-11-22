import java.util.Scanner;

public class Moto {

    public float viajeMoto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la ciudad de destino:");
        String ciudadDestino = sc.nextLine();

        System.out.println("Ingresa la distancia recorrida en km:");
        float distanciaKm = sc.nextInt();

        System.out.println("Ingresa el peaje pagado (0 si no hubo):");
        float peaje = sc.nextInt();

        System.out.println("Ingresa el costo de la gasolina por galón:");
        float costoGasolina = sc.nextInt();

        float consumoGalon = distanciaKm / 100;  // 100 km por galón (ejemplo)
        float gastoGasolina = consumoGalon * costoGasolina;

        System.out.println("-------------");
        System.out.println("Destino: " + ciudadDestino);
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Gasto gasolina: $" + gastoGasolina);
        System.out.println("Peaje: $" + peaje);

        return gastoGasolina + peaje;
    }
}
