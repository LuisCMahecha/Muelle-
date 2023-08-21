public class Embarcacion {

   private  Capitan capitan;

   private  double precioBase;

   private double valorAdicional;

   private  int anioFabricacion;

   private int eslora;

   public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, int eslora) {
      this.capitan = capitan;
      this.precioBase = precioBase;
      this.valorAdicional = valorAdicional;
      this.anioFabricacion = anioFabricacion;
      this.eslora = eslora;
   }


   public double calcularMontoAlquiler() {
      double montoAlquiler = precioBase;
      if (anioFabricacion > 2020) {
         montoAlquiler += valorAdicional;
      }
      return montoAlquiler;
   }



}
