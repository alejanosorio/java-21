package implementarClases;

public class ImpVehiculo {

    public static void main(String[] args) {
        //constructor
        Vehiculo vehiculo=new Vehiculo();
        //ATRIBUTOS
        vehiculo.setColor("green");
        vehiculo.setNunCilindros(6);
        System.out.println("el color del coche es " + vehiculo.getColor() +" tiene cilindros :"+ vehiculo.getNunCilindros());
        //COMPORTAMIENTO
      vehiculo.circular();
      vehiculo.velocidad();
      //HERENCIA
      Motocicleta motocicleta= new  Motocicleta();
      motocicleta.setModelo(2024);
      motocicleta.setNunCilindros(2);
        System.out.println(" LA MOTO MODELO ---"+ motocicleta.getModelo() + " tiene " + motocicleta.getNunCilindros()+" cilindros " +" y esta ");
       motocicleta.circular();
    }
}
