import java.util.Scanner;

public class Moto {

    public int viajeMoto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la ciudad de destino:");
        String ciudadDestino = sc.nextLine();

        System.out.println("Ingresa la distancia recorrida en km:");
        int distanciaKm = sc.nextInt();

        System.out.println("Ingresa el peaje pagado (0 si no hubo):");
        int peaje = sc.nextInt();

        System.out.println("Ingresa el costo de la gasolina por galón:");
        int costoGasolina = sc.nextInt();

        int consumoGalon = distanciaKm / 100;  // 100 km por galón (ejemplo)
        int gastoGasolina = consumoGalon * costoGasolina;

        System.out.println("-------------");
        System.out.println("Destino: " + ciudadDestino);
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Gasto gasolina: $" + gastoGasolina);
        System.out.println("Peaje: $" + peaje);

        return gastoGasolina + peaje;
    }
}
