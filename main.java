import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(new Auto("Mercedes", "GLE", 50.0));
        listaVehiculos.add(new Moto("Tesla", "MT99", 30.0));

        int diasAlquiler = 5;

        System.out.println("=== ALQUILER DE VEHICULOS ===");
        System.out.println("Calculo de alquiler para " + diasAlquiler + " dias:\n");

        for (Vehiculo v : listaVehiculos) {
            double costoTotal = v.calcularCostoAlquiler(diasAlquiler);
            System.out.println("Vehiculo: " + v.getMarca() + " " + v.getModelo() +
                    "\nTarifa base/dia: $" + v.getTarifaBase() +
                    "\nCosto total (" + diasAlquiler + " dias): $" + costoTotal +
                    "\n----------------------------------------");
        }
    }
}
