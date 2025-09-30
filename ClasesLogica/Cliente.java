package ClasesLogica;

public class Cliente{
    private double id=Math.random();
    private String name;
    private String surname;
    private int dni;
public Cliente(){

}
    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {

    this.dni = dni;
    }

    public Cliente(int id, String name, String surname, int dni) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }
}



