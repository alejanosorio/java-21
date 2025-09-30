package loops;

public class bucles {

    public static void main(String[] args) {


        int contador = 11;
        do {
            System.out.println("Contador: " + contador);
            contador++;
            if(contador==5)break;
        } while (contador <= 10);

        //arrays        [0,0][1,0][2.0]
        //   bi         [0,1][1,1][2,1]
        //  dimension   [0,2][1,2][2,2]

        int[][] miArray= {{1,2,3},{4,5,6},{7,8,9}};

        int suma = 0;

        // Bucle anidado para recorrer el array
        for (int i = 0; i < miArray.length; i++) { // Bucle para las filas
            for (int j = 0; j < miArray[i].length; j++) { // Bucle para las columnas
                suma += miArray[i][j]; // Sumar el elemento actual
            }
        }


        System.out.println("la suma es de "+ suma);


        }

    }





