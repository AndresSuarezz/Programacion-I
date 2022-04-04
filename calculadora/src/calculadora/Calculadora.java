package calculadora;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Calculadora {

    public static void main(String[] args) {
        vista pestaña = new vista();
        pestaña.setVisible(true);
        pestaña.setLocationRelativeTo(null);
        pestaña.setResizable(false);
        pestaña.getContentPane().setBackground(new Color(125, 125, 125));
    }
    
}
