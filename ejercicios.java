public class ejercicios {
    public static void main(String[] args) {
practicando();
numerosPositivos();
piramide();
    }


    public static void  practicando(){
        int age=12;
        int nums=12;
        if(age > nums){
            System.out.println(age+" el numero age es mayor");
        } else if (age < nums) {
            System.out.println(nums +" el numero nums es mayor");

        }else{
            System.out.println("los numeros son iguales :");
        }
    }
    public  static void  numerosPositivos(){

        int num= -2;
        if(num >0){
            System.out.println(" el numero " +num+ " es  positivo ");
        } else if (num < 0 ){
            System.out.println(" el numero "  + num +" negativo ");
        }else{
            System.out.println(" el numero "  + num +" es cero");
        }

    }
    public static void piramide(){
        char triangulos= '*';

        System.out.println("     "+triangulos);
        System.out.println("    * * ");
        System.out.println("   * * *");
        System.out.println("  * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *");
    }
}
