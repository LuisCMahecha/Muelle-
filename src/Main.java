public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al muelle de MAKAIA");

        Capitan capitan = new Capitan("Luis", "Mahecha", "ABC123");


        Velero velero   = new Velero(capitan, 100000, 20000, 2023, 30, 8);
        Yate yate = new Yate(capitan, 2000000, 20000, 2023, 15, 9);

        System.out.println("Monto de alquiler del velero: $" + velero.calcularMontoAlquiler());

        System.out.println("Monto de alquiler del yate: $" + yate.calcularMontoAlquiler());

        System.out.println("¿El velero es grande? " + velero.esGrande());
        System.out.println("¿El yate es más lujoso? " + yate.esMasLujo());
    }
}