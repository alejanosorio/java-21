package ClasesLogica;

public class Empleado extends Cliente{

    int legajo;
    String puesto;
    double salario;

public Empleado(){

}

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Empleado(int legajo, String puesto, double salario, int id, String name, String surname, int dni) {
        super(id,name,surname,dni);
        this.legajo = legajo;
        this.puesto=puesto;
        this.salario=salario;
    }
}
