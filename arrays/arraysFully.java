package arrays;

import java.util.Arrays;

public class arraysFully {

    public static void main(String[] args) {
tuArray();
        int[] numbers= {3,56,34,67,81,8};
        Arrays.sort(numbers);
        for (int i :numbers) {
            System.out.println("index numero :"+ i);
        }

        int[][] miArray= {{11,22,3},{4,53,6},{70,89,9}};
       int result=0;
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println(miArray[i][j]);

            }

        }



    }
public static void tuArray(){
    int[][] array1 = {
            {1, 2, 3},
            {1, 2}
    };
    for (int i = 0; i < array1.length; i++) {
        // Primer bucle for recorre las filas
        for (int j = 0; j < array1[i].length; j++) {
            // Segundo bucle for recorre las columnas
            System.out.println(array1[i][j]);
        }
    }
}
    }

