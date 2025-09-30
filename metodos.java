public class metodos {


    public static void main(String[] args) {
        System.out.println(sumar(45,2025,76));
        System.out.println(sumar(32,20));
        saludar("alex");
        int p=suma(new int[]{2,4,3,5,6,7 });
        System.out.println("la suma es de : "+p);
    }
    static int sumar(int x,int y){
        int suma= x + y ;
        return  suma;
    }
    //sobrecarga de metodos
    static int sumar(int x,int y,int c){
        int suma= x + y + c;
        return  suma;
    }
    static  void saludar(String nombre){
        System.out.println("Bienvenido : " + nombre.toUpperCase());
    }
    static int suma(int[] numeros){
        int result=0;
        for (int i :numeros) {
            result += i;

        }
        return result;
    }
}
