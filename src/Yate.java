public class Yate extends Embarcacion{

    private int cantidadCamarotes;


    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, int eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public boolean esMasLujo() {
        return cantidadCamarotes > 7;
    }
}
