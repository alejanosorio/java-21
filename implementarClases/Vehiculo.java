package implementarClases;
//superclase
public class Vehiculo {
//clase bean de java setter and getter
    private int nunCilindros;
    private int modelo;
    private String color;
//METODOS
    public  void circular(){
        System.out.println("-----------habilitado para circular---------------- ");
    }
    public  void velocidad(){
        System.out.println("---------------max speed -------------------");
    }
//GETTERS SETTERS
    public int getNunCilindros() {
        return nunCilindros;
    }

    public void setNunCilindros(int nunCilindros) {
        this.nunCilindros = nunCilindros;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
