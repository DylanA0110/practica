
package Cajero;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends User
{
    protected String pin1;
    private String numeroCuenta1;

    public Login(String pin1, String numeroCuenta1, String pin, String numeroCuenta, String nombre) {
        super(pin, numeroCuenta, nombre);
        this.pin1 = pin1;
        this.numeroCuenta1 = numeroCuenta1;
    }
    
    public void loginPin() {
    JTextField pinField = new JPasswordField();
    int option, intentosP = 0;

    do {
        option = JOptionPane.showConfirmDialog(null, pinField, "Ingrese su PIN", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        intentosP++;

        if (!pinField.getText().equals(getPin()) && intentosP <= 10) {
            JOptionPane.showMessageDialog(null, "PIN incorrecto, vuelva a intentarlo.");
            intentosP++;
        }
    } while (option != JOptionPane.OK_OPTION || pinField.getText().trim().isEmpty() || !pinField.getText().equals(getPin()) && intentosP <= 10);

    if (!pinField.getText().equals(getPin()) && intentosP == 10) {
        System.exit(0);
    } else {
        pin1 = pinField.getText(); 
    }
}
    public void cambiarPIN() 
    {
    JTextField pinField = new JPasswordField();
    JTextField nuevoPinField = new JPasswordField();
    int option, intentosP = 0;

    do {
        option = JOptionPane.showConfirmDialog(null, pinField, "Ingrese su PIN actual", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        intentosP++;

        if (!pinField.getText().equals(pin) && intentosP <= 10) 
        {
            JOptionPane.showMessageDialog(null, "PIN incorrecto, vuelva a intentarlo.");
        }
    } while (option != JOptionPane.OK_OPTION || pinField.getText().trim().isEmpty() || !pinField.getText().equals(pin) && intentosP <= 10);

      if (!pinField.getText().equals(pin) && intentosP == 10) 
          System.exit(0);
      
    if (option == JOptionPane.OK_OPTION)
    {
        do {
            option = JOptionPane.showConfirmDialog(null, nuevoPinField, "Ingrese su nuevo PIN", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (option == JOptionPane.OK_OPTION && nuevoPinField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El nuevo PIN no puede estar vacío. Vuelva a intentarlo.");
            }
        } while (option != JOptionPane.OK_OPTION || nuevoPinField.getText().trim().isEmpty());
        
        if (!pinField.getText().equals(pin) && intentosP == 10) 
            System.exit(0);

        pin = nuevoPinField.getText();
        JOptionPane.showMessageDialog(null, "PIN cambiado exitosamente.");
    }
}    
    public void mostrarINFO(Operaciones op) 
    {
    StringBuilder info = new StringBuilder();

    String userInfo = "Info\n"
            + "Nombre: " + nombre
            + "\nMi numero de cuenta: " + numeroCuenta
            + "\n PIN: " + pin
            + "\n Saldo: " + op.getSaldo();
    info.append(userInfo);

    JOptionPane.showMessageDialog(null, info.toString());
}
    
    
}
