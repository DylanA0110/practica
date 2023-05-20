
package Cajero;

public class User
{
    protected String pin;
    protected String numeroCuenta;
    protected String nombre;

    public User(String pin, String numeroCuenta, String nombre) 
    {
        this.pin = pin;
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
     
}
