public class Velero extends Embarcacion {
    private  int  cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, int eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean esGrande() {
        return cantidadMastiles > 4;

    }
}


