package ClasesLogica;

public class Poo {
    public static void main(String[] args) {
Cliente cliente=new Cliente();
Empleado empleado=new Empleado();
empleado.setLegajo(1232);
cliente.setName("pepe");
empleado.setDni(2323432);


System.out.println(" nombre del cliente es : " + cliente.getName() + " y  el id: "+cliente.getId());
cliente.setName(" jose " );
System.out.println(cliente.getName() + " legajo numero :"+empleado.getLegajo() +" y su dni es :"+empleado.getDni());
    }
}
