package implementarClases;

public class Motocicleta extends Vehiculo{

    Boolean profesional;
    private int pasajeros;
    public void gps(){
        System.out.println("tiene gps ");
    }

    public boolean Profesional() {
        return profesional;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
}
