import javax.swing.JOptionPane;

public class app {
    public static void main(String[] args) {
        inputs();
        
    }
public static void inputs() {

String name=JOptionPane.showInputDialog("intro nombre :");
int age= Integer.parseInt(JOptionPane.showInputDialog("y tu edad"));



System.out.println( "Hola " + name + ", tienes " + age + " años.");



      
    }





    
}
