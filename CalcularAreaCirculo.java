import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class CalcularAreaCirculo {
    // Constante para Pi con una precisión de 100 decimales
    private static final BigDecimal PI = new BigDecimal(3.1416);

    public static void main(String[] args) {
        CalcularAreaCirculo calcularAreaCirculo=new CalcularAreaCirculo();
        BigDecimal radio = new BigDecimal("3.9");
        BigDecimal area = calcularArea(radio);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }
    public static BigDecimal calcularArea(BigDecimal radio) {
        // Definir la precisión para el cálculo
        MathContext mc = new MathContext(100, RoundingMode.HALF_UP); // Ajustar según necesidad

        // Calcular el área:  PI * radio * radio
        BigDecimal area = PI.multiply(radio, mc).multiply(radio, mc);

        return area;
    }


}
