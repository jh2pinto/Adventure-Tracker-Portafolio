public class Principal {

    public static void main(String[] args) {

        Moto honda = new Moto();

        float totalGastos = honda.viajeMoto();

        System.out.println("\nEl costo total del viaje fue: $" + totalGastos);
    }
}