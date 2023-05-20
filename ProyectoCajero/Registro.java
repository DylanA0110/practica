
package Cajero;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registro extends User
{

    public Registro(String pin, String numeroCuenta, String nombre) 
    {
        super(pin, numeroCuenta, nombre);
    }
    
    public String registroPin() {
        JTextField pinField = new JPasswordField();
        int option, intentosP = 0;
        
        do {
            option = JOptionPane.showConfirmDialog(null, pinField, "Registre su PIN", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            intentosP++;
            
            if (pinField.getText().trim().isEmpty() && intentosP <= 10) {
                JOptionPane.showMessageDialog(null, "El pin no puede estar vacío!");
            }
        } while (option != JOptionPane.OK_OPTION || pinField.getText().trim().isEmpty() && intentosP <= 10);

        if (pinField.getText().trim().isEmpty() && intentosP == 10)
                System.exit(0);
                
        String pinIngresado = pinField.getText();
        setPin(pinIngresado);
        
        
        
        return pinIngresado;
    }
    
    
    public void numeroCuenta()
    {
        String numeroC = "";
        int intentosNC = 0;
        do
        {
            numeroC = JOptionPane.showInputDialog("Registre su numero de cuenta: ");
            intentosNC++;
            if(numeroC.trim().isEmpty() && intentosNC <= 10)
                JOptionPane.showMessageDialog(null,"El numero de cuenta no puede estar vacio!");
        }while(numeroC.trim().isEmpty() && intentosNC <= 10);
        
        setNumeroCuenta(numeroC);
        System.out.print("\nNumero de cuenta: " + numeroC + "\n");
    }
    
    public void ingresarNombre()
    {
        String nombre = "";
        
        do
        {
            nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        }while(nombre.trim().isEmpty());
        setNombre(nombre);
    }
   
}
