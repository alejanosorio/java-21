package informatorioJava;

import java.util.Arrays;

public class Operadores {

    public static void main(String[] args) {
       final int VALOR=3;
       final String PALABRA_REAL="verdad";
//el ternario siempre devuelve un valor
      String ternario= ( VALOR==3 ? PALABRA_REAL :"false");
        System.out.println(ternario);
        casting();
        numeros();
    }
    public static void casting(){
        double numeroDouble = 15.75;
        int numeroInt = (int) numeroDouble; // Conversión explícita de double a int
// El valor de numeroInt será 15, perdiendo la parte decimal.
        String cadenaNumero = "123";
        int miNumero = Integer.parseInt(cadenaNumero); // "123" se convierte a int
        System.out.println(numeroDouble);
        System.out.println(numeroInt);
        System.out.println(miNumero);
        char caracter= (int)42;
        System.out.println("el valor del caracter es : "+ caracter);
    }
    public static void numeros(){

        int num= 5;
        double num1= Math.pow(num,3);
        System.out.println("el RESULTADO DE elevar por 20 el numero  : "+num +" ES : "+num1);

    }
}
