public class Triangulos {

    public static void main(String[] args) {
        numerosTriangulos();
        triangulos();
    }

   static public void numerosTriangulos(){
        char caracter= '*';
        String suma= " * *";
        System.out.println("     "+caracter);
        System.out.println("   "+suma);
       System.out.println("   *"+ suma);
       System.out.println("  * *"+ suma);
       System.out.println(" * * *"+ suma);
       System.out.println("* * * *"+ suma);

    }

    static public void triangulos(){

        int altura = 5;
        for (int fila = 1; fila <= altura; fila++) {
            for (int espacio = altura; espacio > fila; espacio--) {
                System.out.print(" ");
            }
            for (int ast = 1; ast <= (2 * fila - 1); ast++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

