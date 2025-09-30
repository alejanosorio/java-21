import java.util.Scanner;

public class helloJava {
    public static void main(String[] args)throws Exception {
        System.out.println("Hello, Java!");
        sums(4, 9);
        System.out.println("la Suma de a + b es : " + sums(4, 9));
        System.out.println("la Suma de a + b es : " + sums(10, 20));
        beers();

    }
    public static int sums(int a, int b) {
        return a + b;
        
    }
    public static void  beers(){

        Scanner scn = new Scanner(System.in);
        System.out.println("INGRESE EL TIPO DE BEER QUE DESEA : ");
        System.out.println("1. Rubia");
        System.out.println("2. Roja");
        System.out.println("3. Negra");
        System.out.println(" ");
        int tipo = scn.nextInt();
        switch (tipo) {
            case 1:
                System.out.println("Usted ha seleccionado cerveza Rubia.");
                break;
            case 2:
                System.out.println("Usted ha seleccionado cerveza Roja.");
                break;
            case 3:
                System.out.println("Usted ha seleccionado cerveza Negra.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        scn.close();
    }
}
