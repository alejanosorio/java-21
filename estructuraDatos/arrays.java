package estructuraDatos;

import java.sql.Array;
import java.util.Arrays;

public class arrays {

    public static void main(String[] args ) {
     myArray();
    otroArray();
    arrayInfo();
    elMismoArray();
        }
   public static  void myArray(){
        String[] matrix={"amd","intel","xching",""};
        matrix[2]="arm";
        matrix[3]="amd64";
        //for- each
       System.out.println("posicion"+matrix);
        for(String x: matrix)  System.out.println(x);

    }

    public static void otroArray () {

        String[] arrays= {"usa","netherland","suize","grece","india"};
        arrays[4]="brazil";
       for(String n:arrays) System.out.println("paiz :"+n);

    }

    public static  void  arrayInfo(){

        int[][] arrayEnteros= new int[3][4];

        arrayEnteros[0][0]=2;
        arrayEnteros[0][1]=45;
        arrayEnteros[0][2]=12;
        arrayEnteros[0][3]=112;
        arrayEnteros[1][0]=7;
        arrayEnteros[1][1]=21;
        arrayEnteros[1][2]=8;
        arrayEnteros[1][3]=82;
        arrayEnteros[2][0]=32;
        arrayEnteros[2][1]=5;
        arrayEnteros[2][2]=92;
        arrayEnteros[2][3]=12;
        int array1=arrayEnteros[0][1];
        int array2=arrayEnteros[1][2];
        int array3=arrayEnteros[2][3];
        System.out.println(array1+array2+array3);

       }
    public static void elMismoArray() {

           int[][] otroArrays = {

                   {2, 45, 12, 55},
                   {23, 5, 52, 90},
                   {12, 85, 2, 42}
           };
           for (int i = 0; i <otroArrays.length ; i++) {
               for (int j = 0; j <otroArrays[i].length ; j++) {
                   System.out.print(" index-> :"+otroArrays[i][j]);


           };

           }
    }
}



