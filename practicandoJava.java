import java.util.Scanner;

public class practicandoJava {

    public static void main(String[] args) {
        Scanner snc =new Scanner(System.in);
        System.out.println("intro el dia para saber si trabajas :");
        String dia= snc.nextLine();
            //este switch la lleva el break implicito.
        switch (dia){
            case "lunes"->System.out.println(dia.toUpperCase()+" .1 dia de la semana");
            case "martes"->System.out.println(dia.toUpperCase()+" .franco servicio");
            case "miercoles", "jueves","viernes"->System.out.println(dia.toUpperCase()+" .dia laboral");
            case "sabado","domingo"->System.out.println(dia.toUpperCase()+" .dia de descanso");
            default->System.out.println(dia.toUpperCase()+" .palabra no valida");
        }





    }
}
